package com.kttkpm_lithuyet2709_crud_student.VO;

import com.kttkpm_lithuyet2709_crud_student.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VO {
    private Student student;
    private Department department;
}
