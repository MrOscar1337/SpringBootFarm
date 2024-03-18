package ru.tagirov.SpringBootFarm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tagirov.SpringBootFarm.Models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteByEmail (String email);
}
