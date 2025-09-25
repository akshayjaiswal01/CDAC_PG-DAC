const express = require('express');
const fs = require('fs');
const app = express();
const port = 3000;

app.use(express.json());

// Load data from MOCK_DATA.json
let users = JSON.parse(fs.readFileSync('MOCK_DATA.json', 'utf-8'));

// Root route
app.get('/', (req, res) => {
  res.send('Hello from Express!');
});

// GET all users
app.get('/users', (req, res) => {
  res.json(users);
});

// GET user by ID
app.get('/users/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const user = users.find(u => u.id === id);

  if (user) {
    res.json(user);
  } else {
    res.status(404).send('User not found');
  }
});

// GET user by ID and Email
app.get('/users/:id/:email', (req, res) => {
  const id = parseInt(req.params.id);
  const email = req.params.email;
  const user = users.find(u => u.id === id && u.email === email);

  if (user) {
    res.json(user);
  } else {
    res.status(404).send('User not found');
  }
});

// DELETE user by ID (via query or body)
app.delete('/users', (req, res) => {
  const id = parseInt(req.body.id || req.query.id);
  const index = users.findIndex(u => u.id === id);

  if (index !== -1) {
    users.splice(index, 1);
    res.send(`User with ID ${id} deleted`);
  } else {
    res.status(404).send('User not found');
  }
});

// Start server
app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
