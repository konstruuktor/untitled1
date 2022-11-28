package ru.zotov.service;

import org.springframework.stereotype.Service;
import ru.zotov.dao.model.Employee;
import ru.zotov.dao.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }
    public Employee findById(Long id) {
        return repository.findById(id);
    }

    public void save(Employee employee) {
        repository.save(employee);
    }

    public void update(Employee employee) {
        repository.update(employee);
    }

    public void delete(Employee employee) {
        repository.delete(employee);
    }
}
