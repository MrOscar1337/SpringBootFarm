package ru.tagirov.SpringBootFarm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tagirov.SpringBootFarm.Models.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
    public void deleteByid(Long id);
}
