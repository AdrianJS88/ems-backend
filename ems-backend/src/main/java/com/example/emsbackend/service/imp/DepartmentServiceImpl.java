package com.example.emsbackend.service.imp;

import com.example.emsbackend.EmployeeMapper.DepartmentMapper;
import com.example.emsbackend.dto.DepartmentDto;
import com.example.emsbackend.entity.Department;
import com.example.emsbackend.repository.DepartmentRepository;
import com.example.emsbackend.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;


    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDepartment(departmentDto);
        Department saveDepartment = departmentRepository.save(department);
        return DepartmentMapper.mapToDepartmentDto(saveDepartment);
    }
}
