package com.eddie.dao.impl;


import com.eddie.dao.UserDao;
import com.eddie.domain.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {


    @SuppressWarnings("unchecked")
    @Override
    public List<User> list() {
        return getHibernateTemplate().loadAll(User.class);
    }

    @Override
    public User save(User user) {
        getHibernateTemplate().save(user);
        return user;
    }

    @Override
    public void delete(User user) {
        getHibernateTemplate().delete(user);
    }
}