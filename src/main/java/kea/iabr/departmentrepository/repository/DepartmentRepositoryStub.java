package kea.iabr.departmentrepository.repository;

import kea.iabr.departmentrepository.model.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("DEPARTMENT_REPOSITORY_STUB")
public class DepartmentRepositoryStub implements IDepartmentRepository{

    private List<Department> departments = List.of(
            new Department(10, "ACCOUNTING_S", "NEW YORK"),
            new Department(20, "RESEARCH_S", "DALLAS"),
            new Department(30, "SALES_S", "CHICAGO"),
            new Department(40, "OPERATIONS_S", "BOSTON")
    );

    @Override
    public List<Department> findAll() {
        return departments;
    }


}
