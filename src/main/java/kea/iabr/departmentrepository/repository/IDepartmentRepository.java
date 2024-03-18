package kea.iabr.departmentrepository.repository;

import kea.iabr.departmentrepository.model.Department;

import java.util.List;

public interface IDepartmentRepository {
    public List<Department> findAll();

    //TO DO other CRUD methods
}
