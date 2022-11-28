package ru.zotov.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import ru.zotov.dao.model.Employee;
import ru.zotov.service.EmployeeService;

import javax.persistence.Id;

@RestController
public class EmployeeController {
    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    public Employee getById(Long id) {
        return service.findById(id);
    }
}
