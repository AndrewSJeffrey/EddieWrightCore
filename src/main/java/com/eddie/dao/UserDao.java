package com.eddie.dao;

import com.eddie.domain.User;

import java.util.List;


public interface UserDao {
    public List<User> list();
    public User save(User vehicle);
    public void delete(User vehicle);
}
