package com;

import com.licai.model.User;
import com.licai.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class lcTest {
    @Autowired
    private UserService userService;

    @Test
    public void testUser(){

        List<User> list=userService.list();
        for(User u : list){
            System.out.println(u.getUsername());

        }
    }
}
