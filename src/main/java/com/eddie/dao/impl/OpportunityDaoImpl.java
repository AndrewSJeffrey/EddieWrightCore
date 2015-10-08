    package com.eddie.dao.impl;


import com.eddie.dao.OpportunityDao;
import com.eddie.domain.Opportunity;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class OpportunityDaoImpl extends HibernateDaoSupport implements OpportunityDao {


    @SuppressWarnings("unchecked")
    @Override
    public List<Opportunity> list() {
        return getHibernateTemplate().loadAll(Opportunity.class);
    }


    @Override
    public Opportunity save(Opportunity opportunity) {
        getHibernateTemplate().saveOrUpdate(opportunity);
        return opportunity;
    }

    @Override
    public void delete(Opportunity opportunity) {
        getHibernateTemplate().delete(opportunity);
    }

}