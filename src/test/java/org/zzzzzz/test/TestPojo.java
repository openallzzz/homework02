package org.zzzzzz.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zzzzzz.Homework02Application;
import org.zzzzzz.pojo.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Homework02Application.class)
public class TestPojo {

    @Autowired
    private Student student;

    @Test
    public void testStu() {
        System.out.println(student);
    }

}
