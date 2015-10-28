package com.eddie.dao.impl;


import com.eddie.dao.UserRoleDao;
import com.eddie.domain.UserRole;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class UserRoleDaoImpl extends HibernateDaoSupport implements UserRoleDao {


    @SuppressWarnings("unchecked")
    @Override
    public List<UserRole> list() {
        return getHibernateTemplate().loadAll(UserRole.class);
    }


    @Override
    public UserRole save(UserRole userRole) {
        getHibernateTemplate().saveOrUpdate(userRole);
        return userRole;
    }

    @Override
    public void delete(UserRole userRole) {
        getHibernateTemplate().delete(userRole);
    }

}