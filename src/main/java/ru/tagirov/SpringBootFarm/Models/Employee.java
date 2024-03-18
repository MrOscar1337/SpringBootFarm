package ru.tagirov.SpringBootFarm.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private boolean active;
}
