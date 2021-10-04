package com.kttkpm_lithuyet2709_crud_student.restController;

import com.kttkpm_lithuyet2709_crud_student.VO.VO;
import com.kttkpm_lithuyet2709_crud_student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public VO getByID(@PathVariable Long id){
        return studentService.getStudentByID(id);
    }
}
