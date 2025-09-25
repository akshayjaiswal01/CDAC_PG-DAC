const http = require('http');
const { URL } = require('url');

let todos = [
    { id: 1, task: 'Read Carefully' },
    { id: 2, task: 'Implement' }
];

const server = http.createServer((request, res) => {
    const { method, url } = request;
    const parsedUrl = new URL(url, `http://${request.headers.host}`);
    const pathname = parsedUrl.pathname;

    if (method === 'GET' && pathname === '/todos') {
        res.writeHead(200, { 'Content-Type': 'application/json' });
        res.end(JSON.stringify(todos));
        return;
    }

    const todoIdMatch = pathname.match(/^\/todos\/(\d+)$/);
    if (method === 'GET' && todoIdMatch) {
        const id = parseInt(todoIdMatch[1]);
        const todo = todos.find(t => t.id === id);

        if (todo) {
            res.writeHead(200, { 'Content-Type': 'application/json' });
            res.end(JSON.stringify(todo));
        } else {
            res.writeHead(404, { 'Content-Type': 'application/json' });
            res.end(JSON.stringify({ error: 'Todo not found' }));
        }
        return;
    }

    res.writeHead(404, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({ error: 'Route not found' }));
});

server.listen(3409, () => console.log("Server started on port 3409"));
