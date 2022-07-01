package com.dailycodebuffer.microservices.department.repository;

import com.dailycodebuffer.microservices.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {


    Department findDepartmentById(Integer id);
}
