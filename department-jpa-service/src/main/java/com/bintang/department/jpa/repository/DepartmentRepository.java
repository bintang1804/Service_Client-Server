/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bintang.department.jpa.repository;

import com.bintang.department.jpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LABSIDOSEN
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentId(Long departmentId);
    
}
