package com.eddie.dao.impl;


import com.eddie.dao.ActionDao;
import com.eddie.dao.ContactDao;
import com.eddie.domain.Action;
import com.eddie.domain.Contact;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.math.BigInteger;
import java.util.List;
@SuppressWarnings("unchecked")
public class ActionDaoImpl extends HibernateDaoSupport implements ActionDao {



    @Override
    public List<Action> list() {
        return getHibernateTemplate().loadAll(Action.class);
    }


    @Override
    public Action save(Action action) {
        getHibernateTemplate().saveOrUpdate(action);
        return action;
    }

    @Override
    public void delete(Action action) {
        getHibernateTemplate().delete(action);
    }

    @Override
    public List<Action> findByUserId(int id) {

        Query query = getSessionFactory().getCurrentSession().createQuery(
                "Select A from Action A where A.assignedTo = :assignedTo and A.nextAction = null"
        );
        query.setParameter("assignedTo", id);
       return query.list();
    }
}