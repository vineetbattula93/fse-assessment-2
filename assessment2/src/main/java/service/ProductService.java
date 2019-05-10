package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> findProductByBrand(String brand){
        return productRepository.findByBrand(brand);
    }

    public List<Product> findProductByColor(String color){
        return productRepository.findByColor(color);
    }

    public List<Product> findProductByCategory(String category){
        return productRepository.findByCategory(category);
    }

}
