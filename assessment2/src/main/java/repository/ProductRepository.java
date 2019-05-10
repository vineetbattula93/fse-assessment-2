package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByBrand(String brand);
    List<Product> findByColor(String color);
    List<Product> findByCategory(String category);
}
