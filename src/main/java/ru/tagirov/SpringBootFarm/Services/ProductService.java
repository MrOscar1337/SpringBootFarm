package ru.tagirov.SpringBootFarm.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tagirov.SpringBootFarm.Models.Harvest;
import ru.tagirov.SpringBootFarm.Models.Product;
import ru.tagirov.SpringBootFarm.Repositories.HarvestRepository;
import ru.tagirov.SpringBootFarm.Repositories.ProductRepository;


import java.time.LocalDate;
import java.util.List;



@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    private final HarvestRepository harvestRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Transactional
    public void deleteProduct(Long id) {
        productRepository.deleteByid(id);
    }

    ;

    public void addHarvest(Long employeeId, Long productId, double quantity) {
        Harvest harvest = new Harvest();
        harvest.setEmployeeId(employeeId);
        harvest.setProductId(productId);
        harvest.setQuantity(quantity);
        harvest.setDate(LocalDate.now());

        harvestRepository.save(harvest);
    }

    public List<Harvest> getAllHarvest() {
        return harvestRepository.findAll();
    }

    public List<Harvest> findByDate(LocalDate date) {
        return harvestRepository.findByDate(date);
    }

    public List<Harvest> findByEmployeeId(Long employeeId){ return harvestRepository.findByEmployeeId(employeeId);}
    }

