const express = require('express');
const app = express();
const bodyParser = require('body-parser');

// parse application/x-www-form-urlencoded
app.use(bodyParser.urlencoded({ extended: false }));

// parse application/json
app.use(bodyParser.json());

// User Entity

// Get all users
app.get('/users', (req, res) => {
  // Retrieve all users from database
  let users = [
    { id: 1, name: 'John' },
    { id: 2, name: 'Jane' },
    { id: 3, name: 'Bob' }
  ];

  res.json(users);
});

// Get single user
app.get('/users/:id', (req, res) => {
  // Retrieve user with the specified id from database
  let user = { id: 1, name: 'John' };

  res.json(user);
});

// Create new user
app.post('/users', (req, res) => {
  // Create new user in database
  let user = req.body;

  res.json(user);
});

// Update user
app.put('/users/:id', (req, res) => {
  // Update user with the specified id in database
  let user = req.body;

  res.json(user);
});

// Delete user
app.delete('/users/:id', (req, res) => {
  // Delete user with the specified id from database
  res.send('User deleted');
});

// Product Entity

// Get all products
app.get('/products', (req, res) => {
  // Retrieve all products from database
  let products = [
    { id: 1, name: 'Product 1' },
    { id: 2, name: 'Product 2' },
    { id: 3, name: 'Product 3' }
  ];

  res.json(products);
});

// Get single product
app.get('/products/:id', (req, res) => {
  // Retrieve product with the specified id from database
  let product = { id: 1, name: 'Product 1' };

  res.json(product);
});

// Create new product
app.post('/products', (req, res) => {
  // Create new product in database
  let product = req.body;

  res.json(product);
});

// Update product
app.put('/products/:id', (req, res) => {
  // Update product with the specified id in database
  let product = req.body;

  res.json(product);
});

// Delete product
app.delete('/products/:id', (req, res) => {
  // Delete product with the specified id from database
  res.send('Product deleted');
});

// Login
app.post('/login',
