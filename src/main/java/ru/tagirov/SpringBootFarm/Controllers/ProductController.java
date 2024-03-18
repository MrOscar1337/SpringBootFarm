package ru.tagirov.SpringBootFarm.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.tagirov.SpringBootFarm.Models.Harvest;
import ru.tagirov.SpringBootFarm.Models.Product;
import ru.tagirov.SpringBootFarm.Services.ProductService;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    @PreAuthorize("hasAuthority('ROLE_USER') || hasAuthority('ROLE_ADMIN')")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("add_product")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String addProduct (@RequestBody Product product){
        productService.addProduct(product);
        return "The product was successfully added";
    }

    @PutMapping("update_product")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("delete_product/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "The product was deleted";
    }

    @PostMapping("add_harvest")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String addHarvest (@RequestBody Harvest harvest){
        productService.addHarvest(harvest.getEmployeeId(), harvest.getProductId(), harvest.getQuantity());
        return "The harvest was recorded";
    }

    @GetMapping("harvest")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Harvest> getAllHarvest() {
        return productService.getAllHarvest();
    }

    @GetMapping("harvest/{date}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Harvest> findByDate (@PathVariable LocalDate date){ return productService.findByDate(date);}

    @GetMapping("harvest/findByEmployee/{employeeId}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Harvest> findByEmployeeId(@PathVariable Long employeeId){
        return productService.findByEmployeeId(employeeId);}
}
