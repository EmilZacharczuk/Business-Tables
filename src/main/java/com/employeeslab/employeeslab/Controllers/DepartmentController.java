package com.employeeslab.employeeslab.Controllers;

import com.employeeslab.employeeslab.Models.Department;
import com.employeeslab.employeeslab.Repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getAllDepartments() {
        return this.departmentRepository.findAll();
    }
    @GetMapping("{id}")
    public Optional<Department> getDepartment(@PathVariable Long id) {
        return this.departmentRepository.findById(id);
    }
}
