package com.kttkpm_lithuyet2709_crud_student.service;

import com.kttkpm_lithuyet2709_crud_student.VO.Department;
import com.kttkpm_lithuyet2709_crud_student.VO.VO;
import com.kttkpm_lithuyet2709_crud_student.entity.Student;
import com.kttkpm_lithuyet2709_crud_student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {

    @Autowired
     StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    public VO getStudentByID(Long id){
        Student student= studentRepository.findById(id).get();
        System.out.println(student);
        Department department= restTemplate.getForObject("department/"+student.getDepartmentId(),Department.class);
        System.out.println(department);
        VO vo = new VO();
        vo.setStudent(student);
        vo.setDepartment(department);
        return vo;
    }
}
