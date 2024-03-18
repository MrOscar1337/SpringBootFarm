package ru.tagirov.SpringBootFarm.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tagirov.SpringBootFarm.Models.Employee;
import ru.tagirov.SpringBootFarm.Repositories.EmployeeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        employee.setActive(true);
        return employeeRepository.save(employee);
    }

    @Transactional
    public void deleteEmployee (String email){
        employeeRepository.deleteByEmail(email);
    }
}
