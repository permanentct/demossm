package com.itheima.service;

import com.itheima.domain.Student;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface StudentService {
    public boolean save(Student student);
    public boolean update(Student student);
    public boolean delete(Integer s_id);
    public Student  getById(Integer s_id);

    public List<Student> getAll();
}
