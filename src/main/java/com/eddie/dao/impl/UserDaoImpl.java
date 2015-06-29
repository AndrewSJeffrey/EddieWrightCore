package com.eddie.dao.impl;


import com.eddie.dao.UserDao;
import com.eddie.domain.User;
import org.hibernate.Query;
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
        getHibernateTemplate().saveOrUpdate(user);
        return user;
    }

    @Override
    public void delete(User user) {
        getHibernateTemplate().delete(user);
    }

    @Override
    public User findByUsername(String username) {
        Query query = getSessionFactory().getCurrentSession().createQuery(
                "select U from User U where (U.username = :username)");
        User user = (User) query.setParameter("username", username).setCacheable(true).uniqueResult();
        return user;
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        Query query = getSessionFactory().getCurrentSession().createQuery(
                "select U from User U where (U.username = :username and U.password = :password)");
        User user = (User) query
                .setParameter("username", username)
                .setParameter("password", password)
                .setCacheable(true).uniqueResult();
        return user;
    }
}