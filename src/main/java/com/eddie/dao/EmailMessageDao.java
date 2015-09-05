package com.eddie.dao;

import com.eddie.domain.EmailMessage;
import java.util.List;


public interface EmailMessageDao {
    public List<EmailMessage> list();
    public List<EmailMessage> getUnprocessed();
    public EmailMessage save(EmailMessage user);
    public void delete(EmailMessage user);
}
