package com.eddie.dao;

import com.eddie.domain.Event;
import com.eddie.domain.User;

import java.util.List;


public interface EventDao {
    public List<Event> list();
    public List<Event> activeEvents();
    public Event save(Event user);
    public void delete(Event user);

}
