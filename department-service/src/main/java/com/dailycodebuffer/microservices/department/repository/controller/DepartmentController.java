package com.dailycodebuffer.microservices.department.repository.controller;

import com.dailycodebuffer.microservices.department.entity.Department;
import com.dailycodebuffer.microservices.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){

        log.info(">>>> Inside Save method of Department Controller <<<<<");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable Integer id){

        log.info(">>>> Inside Get method of Department Controller <<<<<");
        return departmentService.findDepartmentById(id);
    }
}
