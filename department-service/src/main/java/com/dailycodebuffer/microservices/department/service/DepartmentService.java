package com.dailycodebuffer.microservices.department.service;

import com.dailycodebuffer.microservices.department.entity.Department;
import com.dailycodebuffer.microservices.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info(">>>> Inside Save method of Department Service <<<<<");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Integer id) {
        return departmentRepository.findDepartmentById(id);
    }

}
