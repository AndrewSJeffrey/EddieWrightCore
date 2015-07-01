package com.eddie.dao.impl;


import com.eddie.dao.ContactDao;
import com.eddie.domain.Contact;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

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

}