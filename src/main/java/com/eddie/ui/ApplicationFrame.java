package com.eddie.ui;

import com.eddie.dao.UserDao;
import com.eddie.domain.User;
import com.eddie.login.LoginPanel;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.*;


public class ApplicationFrame extends JFrame {


    @Autowired
    private UserDao userDao;

    @Autowired
    private LoginPanel loginPanel;

    public ApplicationFrame() throws HeadlessException {

    }

    public void init() {
        java.util.List<User> list = userDao.list();
        for (User user : list) {
            System.out.println(user);
        }
        add(loginPanel);
        setPreferredSize(new Dimension(1000, 500));
        setMinimumSize(new Dimension(1000, 500));
        setVisible(true);
    }
}
