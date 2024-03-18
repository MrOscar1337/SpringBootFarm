package ru.tagirov.SpringBootFarm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tagirov.SpringBootFarm.Models.Harvest;

import java.time.LocalDate;
import java.util.List;

public interface HarvestRepository extends JpaRepository<Harvest, Long> {
    List<Harvest> findByDate(LocalDate date);

    List<Harvest> findByEmployeeId(Long employeeId);
}
