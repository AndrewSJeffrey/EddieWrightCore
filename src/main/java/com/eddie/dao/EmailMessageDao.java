package com.eddie.dao;

import com.eddie.domain.EmailMessage;
import org.hibernate.ejb.HibernateEntityManagerImplementor;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;


public interface EmailMessageDao  {
    public List<EmailMessage> list();
    public List<EmailMessage> getUnprocessed();
    public EmailMessage save(EmailMessage user);
    public EmailMessage load(int id);
    public void delete(EmailMessage user);
}
