package com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class StudentTest {
    @Autowired
      private StudentService studentService;

    @Test
    public void testGetById(){
        Student student = studentService.getById(1);
        System.out.println(student);
    }

}
