package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/song")
    public String postSong(@RequestBody Product product){
        productService.saveProduct(product);
        return "saved";
    }

    @RequestMapping("/search")
    public List<Product> getProductsByFilter(@RequestParam(value = "brand", required = false) String brand,
                                             @RequestParam(value = "color", required = false) String color,
                                             @RequestParam(value = "category", required = false) String category) {

        if(brand != null) {
            List<Product> prods = productService.findProductByBrand(brand);
            return prods;
        }
        if(color != null) {
            List<Product> prods = productService.findProductByColor(color);
            return prods;
        }
        if(category != null) {
            List<Product> prods = productService.findProductByCategory(category);
            return prods;
        }

        return null;

    }
}
