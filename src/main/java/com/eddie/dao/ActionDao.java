package com.eddie.dao;

import com.eddie.domain.Action;

import java.util.List;


public interface ActionDao {
    public List<Action> list();
    public List<Action> findByUserId(int id);
    public Action save(Action action);
    public void delete(Action action);
}
