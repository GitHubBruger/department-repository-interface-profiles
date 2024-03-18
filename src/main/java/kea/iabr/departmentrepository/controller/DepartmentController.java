package kea.iabr.departmentrepository.controller;

import kea.iabr.departmentrepository.model.Department;
import kea.iabr.departmentrepository.repository.DepartmentRepositoryJDBC;
import kea.iabr.departmentrepository.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "depts")
public class DepartmentController {

    private IDepartmentRepository departmentRepository;

    public DepartmentController(ApplicationContext context, @Value("${department.repository.impl}") String impl) {
       departmentRepository = (IDepartmentRepository) context.getBean(impl);
    }

    @GetMapping("")
    public String findAll(Model model) {
        List<Department> departments = departmentRepository.findAll();
        model.addAttribute("departments", departments);

        return "departments";
    }

}
