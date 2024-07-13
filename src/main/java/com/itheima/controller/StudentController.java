package com.itheima.controller;

import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Result save(@RequestBody Student student) {
        boolean save = studentService.save(student);
        return new Result(save?Code.Get_Su:Code.Get_ERR,"",student);
    }

    @PutMapping
    public Result update(@RequestBody Student student) {
        boolean save = studentService.update(student);
        return new Result(save?Code.Get_Su:Code.Get_ERR,"",student);
    }

    @DeleteMapping("/{s_id}")
    public Result delete(@PathVariable Integer s_id) {
        boolean save = studentService.delete(s_id);
        return new Result(save?Code.Get_Su:Code.Get_ERR,"");
    }

     @GetMapping("/{s_id}")
    public Result getById(@PathVariable Integer s_id) {
         Student byId = studentService.getById(s_id);
         Integer code = byId != null ? Code.Get_Su:Code.Get_ERR;
         String msg = byId != null ?"" :"数据不存在";
         return new Result(code,msg,byId);
    }

   @GetMapping
    public Result getAll() {
       List<Student> all = studentService.getAll();
       Integer code = all != null ? Code.Get_Su:Code.Get_ERR;
       String msg = all != null ?"" :"数据不存在";
       int i = 1/0;
       return new Result(code,msg,all);
    }
}
