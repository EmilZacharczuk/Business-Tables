package com.employeeslab.employeeslab.Repositories;

import com.employeeslab.employeeslab.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
