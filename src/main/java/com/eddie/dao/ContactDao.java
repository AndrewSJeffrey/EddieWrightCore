package com.eddie.dao;

import com.eddie.domain.Contact;

import java.util.List;


public interface ContactDao {
    public List<Contact> list();
    public Contact save(Contact user);
    public void delete(Contact user);

    public int count();

    public List<Contact> search(String search);
    public List<Contact> searchFirstName(String search);
}
