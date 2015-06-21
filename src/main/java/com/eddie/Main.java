package com.eddie;

import com.eddie.ui.ApplicationFrame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-properties.xml");

        ApplicationFrame frame = context.getBean(ApplicationFrame.class);
    }
}
