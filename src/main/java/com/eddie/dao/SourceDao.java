package com.eddie.dao;

import com.eddie.domain.Source;

import java.util.List;


public interface SourceDao {
    public List<Source> list();

    public Source save(Source source);

    public void delete(Source source);

}
