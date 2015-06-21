package com.eddie.dao;

import com.eddie.domain.User;

import java.util.List;


public interface UserDao {
    public List<User> list();
    public User save(User vehicle);
    public void delete(User vehicle);
    public User findByUsername(String username);
    public User findByUsernameAndPassword(String username, String password);
}
