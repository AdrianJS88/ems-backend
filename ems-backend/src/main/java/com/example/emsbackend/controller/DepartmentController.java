package com.example.emsbackend.controller;

import com.example.emsbackend.dto.DepartmentDto;
import com.example.emsbackend.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

private DepartmentService departmentService;
  // build add department rest api

    public ResponseEntity<DepartmentDto> createDepartment (DepartmentDto departmentDto){

        DepartmentDto department = departmentService.createDepartment(departmentDto);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }
}
