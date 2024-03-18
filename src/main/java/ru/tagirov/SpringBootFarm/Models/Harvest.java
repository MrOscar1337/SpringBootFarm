package ru.tagirov.SpringBootFarm.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Harvest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "employee_id")
    private Long employeeId;
    @Column(name = "product_id")
    private Long productId;

    private double quantity;

    private LocalDate date;
}
