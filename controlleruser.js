// controllers/users.js
const User = require('../models/user');

exports.getUsers = async (req, res) => {
  const users = await User.find();
  res.json(users);
};

exports.createUser = async (req, res) => {
  const user = new User(req.body);
  await user.save();
  res.json({ message: 'User created' });
};

exports.updateUser = async (req, res) => {
  const { id } = req.params;
  const newUser = req.body;
  await User.findByIdAndUpdate(id, newUser);
  res.json({ message: 'User updated' });
};

exports.deleteUser = async (req, res) => {
  const { id } = req.params;
  await User.findByIdAndDelete(id);
  res.json({ message: 'User deleted' });
};