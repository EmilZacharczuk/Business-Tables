package com.employeeslab.employeeslab;

import com.employeeslab.employeeslab.Models.Department;
import com.employeeslab.employeeslab.Models.Employee;
import com.employeeslab.employeeslab.Models.Project;
import com.employeeslab.employeeslab.Repositories.DepartmentRepository;
import com.employeeslab.employeeslab.Repositories.EmployeeRepository;
import com.employeeslab.employeeslab.Repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeslabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("HR");
		departmentRepository.save(department);
		Employee employee = new Employee("James", "james", 126, department);
		employeeRepository.save(employee);
	}
	@Test
	public void addEmployeeAndProjects(){
		Department department = new Department("HR");
		departmentRepository.save(department);
		Employee employee1 = new Employee("Bob", "Ross", 828, department);
		employeeRepository.save(employee1);
		Project project = new Project("Lasers", 90);
		projectRepository.save(project);
		project.addEmployee(employee1);
		projectRepository.save(project);
	}

}
