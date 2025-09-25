const express = require('express');
const fs = require('fs');
const { dirname } = require('path');
const app = express();
const port = 4000;
const filePath = 'MOCK_DATA.json';

app.use(express.json());
app.use(express.static('public'));

function readUsers() {
  return JSON.parse(fs.readFileSync(filePath, 'utf-8'));
}

function writeUsers(users) {
  fs.writeFileSync(filePath, JSON.stringify(users, null, 2));
}

app.get('/', (req, res)=> {
    res.send("Hello, this is Express.js project");
});

app.get('/users', (req, res)=> {
    const users = readUsers();
    res.json(users)
});

app.get('/users/aboutus', (req, res)=>{
    res.sendFile(__dirname+'/public/aboutus.html');
})

app.get('/users/:id', (req, res)=> {
    const id = parseInt(req.params.id);
    const users = readUsers();
    const user = users.find( (u)=>{
        return u.id === id;
    } )

    if(user){
        res.json(user);
    }
    else{
        res.status(404).send("User Not Found");
    }
});

app.get('/users/:id/:email', (req, res)=>{
    const id = parseInt(req.params.id);
    const email = req.params.email;
    const users = readUsers();

    const user = users.find( (u)=>{
        return (u.id === id && u.email === email);
    } )

    if(user){
        res.json(user);
    }
    else{
        res.status(404).send("User Not Found");
    }
});

app.delete('/users', (req, res)=>{
    const id = parseInt(req.body?.id || req.query?.id);
    let users = readUsers();
    const index = users.findIndex( (u)=>{
        return u.id === id;
    } )

    if(index !== -1){
        users.splice(index, 1);
        writeUsers(users);
        res.send(`User with ID ${id} deleted`);
    }
    else{
        res.status(404).send("User Not Found");
    }
});

app.post('/users', (req, res)=>{
    const newUser = req.body;
    const users = readUsers();

    if(!newUser.id || !newUser.first_name || !newUser.last_name || !newUser.email){
        return res.status(400).send("Missing required user fields");
    }

    const exists = users.some( (u)=>{
        return u.id === newUser.id;
    } )

    if(exists){
        return res.status(409).send(`user with id: ${newUser.id} is already exists`)
    }

    users.push(newUser);
    writeUsers(users);
    res.status(201).send(`User with id: ${newUser.id} is added`); 
});

app.put('/users/:id', (req, res)=>{
    const id = parseInt(req.params.id);
    let users = readUsers();
    const user = users.find( (u)=>{
        return u.id === id;
    } )

    if(!user){
        return res.status(404).send("User Not Found");
    }

    if (!req.body.first_name && !req.body.last_name && !req.body.email) {
        return res.status(400).send("No valid fields to update");
    }


    Object.assign(user, req.body);
    writeUsers(users)
    res.send("User Updated");
});



app.listen(port, ()=>{
    console.log(`server running at http://localhost:${port}`);
});