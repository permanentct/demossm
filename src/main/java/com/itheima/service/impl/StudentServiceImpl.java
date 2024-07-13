package com.itheima.service.impl;

import com.itheima.dao.StudentDAO;
import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;
    @Override
    public boolean save(Student student) {
        studentDAO.save(student);
        return true;
    }

    @Override
    public boolean update(Student student) {
        studentDAO.update(student);
        return true;
    }

    @Override
    public boolean delete(Integer s_id) {
        studentDAO.delete(s_id);
        return true;
    }

    @Override
    public Student getById(Integer s_id) {
        return studentDAO.getById(s_id);
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
    }
}
