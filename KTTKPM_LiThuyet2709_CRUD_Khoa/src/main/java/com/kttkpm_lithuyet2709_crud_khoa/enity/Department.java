package com.kttkpm_lithuyet2709_crud_khoa.enity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String deparmentName;
    private String deparmentAddress;
    private String deparmentCode;
}
