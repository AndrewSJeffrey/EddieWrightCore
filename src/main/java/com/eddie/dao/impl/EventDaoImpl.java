package com.eddie.dao.impl;


import com.eddie.dao.EventDao;
import com.eddie.dao.UserDao;
import com.eddie.domain.Event;
import com.eddie.domain.User;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class EventDaoImpl extends HibernateDaoSupport implements EventDao {


    @SuppressWarnings("unchecked")
    @Override
    public List<Event> list() {
        return getHibernateTemplate().loadAll(Event.class);
    }

    @Override
    public Event save(Event event) {
        getHibernateTemplate().saveOrUpdate(event);
        return event;
    }

    @Override
    public void delete(Event event) {
        getHibernateTemplate().delete(event);
    }

}