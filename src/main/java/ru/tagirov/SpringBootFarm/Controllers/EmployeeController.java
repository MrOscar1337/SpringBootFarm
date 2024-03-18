package ru.tagirov.SpringBootFarm.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.tagirov.SpringBootFarm.Models.Employee;
import ru.tagirov.SpringBootFarm.Services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
   @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping("add_employee")
   @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "The employee was successfully added";
    }

    @DeleteMapping("delete_employee/{email}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String deleteEmployee(@PathVariable String email){
        employeeService.deleteEmployee(email);
        return "The employee was deleted";
    }

}
