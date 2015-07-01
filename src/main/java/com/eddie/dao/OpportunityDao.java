package com.eddie.dao;

import com.eddie.domain.Opportunity;

import java.util.List;


public interface OpportunityDao {
    public List<Opportunity> list();
    public Opportunity save(Opportunity opportunity);
    public void delete(Opportunity opportunity);

}
