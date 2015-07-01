package com.eddie.dao.impl;


import com.eddie.dao.SourceDao;
import com.eddie.domain.Source;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class SourceDaoImpl extends HibernateDaoSupport implements SourceDao {


    @SuppressWarnings("unchecked")
    @Override
    public List<Source> list() {
        return getHibernateTemplate().loadAll(Source.class);
    }


    @Override
    public Source save(Source source) {
        getHibernateTemplate().saveOrUpdate(source);
        return source;
    }

    @Override
    public void delete(Source source) {
        getHibernateTemplate().delete(source);
    }

}