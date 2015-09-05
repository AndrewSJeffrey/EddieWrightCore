package com.eddie.dao.impl;


import com.eddie.dao.ContactDao;
import com.eddie.domain.Contact;
import com.sun.javafx.fxml.expression.Expression;
import org.hibernate.Criteria;
import org.hibernate.criterion.*;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.math.BigInteger;
import java.util.List;

public class ContactDaoImpl extends HibernateDaoSupport implements ContactDao {


    @SuppressWarnings("unchecked")
    @Override
    public List<Contact> list() {
        return getHibernateTemplate().loadAll(Contact.class);
    }


    @Override
    public Contact save(Contact contact) {
        getHibernateTemplate().saveOrUpdate(contact);
        return contact;
    }

    @Override
    public void delete(Contact contact) {
        getHibernateTemplate().delete(contact);
    }

    @Override
    public int count() {
        return ((BigInteger) getSessionFactory().getCurrentSession().createSQLQuery("SELECT COUNT(*) FROM contacts").uniqueResult()).intValue();
    }

    @Override
    public List<Contact> search(String search) {

        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Contact.class);
        LogicalExpression or = Restrictions.or(Restrictions.like("firstName", search,  MatchMode.ANYWHERE),
                Restrictions.like("surname", search, MatchMode.ANYWHERE));

        LogicalExpression or2 = Restrictions.or(Restrictions.like("companyName", search,  MatchMode.ANYWHERE),
                Restrictions.like("telephone", search, MatchMode.ANYWHERE));

        LogicalExpression or3 = Restrictions.or(Restrictions.like("mobile", search,  MatchMode.ANYWHERE),
                Restrictions.like("email", search, MatchMode.ANYWHERE));


        criteria.add(Restrictions.or(Restrictions.or(or, or2), or3));
        List list = criteria.list();

        return list;
    }

    @Override
    public List<Contact> searchFirstName(String search) {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Contact.class);
        SimpleExpression firstName = Restrictions.like("firstName", search, MatchMode.START);
        criteria.add(firstName);
        List list = criteria.list();

        return list;
    }
}