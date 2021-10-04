package com.kttkpm_lithuyet2709_crud_khoa.restController;

import com.kttkpm_lithuyet2709_crud_khoa.enity.Department;
import com.kttkpm_lithuyet2709_crud_khoa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentRestController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping
    public void saveDepartment(@RequestBody Department department){
        departmentRepository.save(department);
    }

    @GetMapping("/{id}")
    public Department getByID(@PathVariable Long id){
       return departmentRepository.findById(id).get();
    }

    @GetMapping
    public List<Department> getALll(){
        return departmentRepository.findAll();
    }
}
