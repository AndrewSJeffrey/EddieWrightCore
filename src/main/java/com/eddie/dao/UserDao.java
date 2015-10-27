package com.eddie.dao;

import com.eddie.domain.User;

import java.util.List;


public interface UserDao {
    public List<User> list();
    public User save(User user);
    public void delete(User user);
    public User findByUsername(String username);
    public User findByUsernameAndPassword(String username, String password);
    public User load(int id);
}
