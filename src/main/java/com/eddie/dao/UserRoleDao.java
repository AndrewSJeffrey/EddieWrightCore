package com.eddie.dao;


import com.eddie.domain.UserRole;

import java.util.List;

public interface UserRoleDao {
    public List<UserRole> list();
    public UserRole save(UserRole action);
    public void delete(UserRole action);
}
