package Services;

import Entities.Product;
import Entities.User;
import Repositories.ProductRepository;

import java.util.Date;
import java.util.List;

public class ProductService {

    ProductRepository productRepository = new ProductRepository();

    private List<Product> getProductsBySaleQuantity(Integer minSaleQuantity, Integer maxSaleQuantity, Date fromTime, Date toTime){
        productRepository.getProductsBySaleQuantity(minSaleQuantity, maxSaleQuantity, fromTime, toTime);
    }

    private List<Product> getProductsByPrice(Float minPrice, Float maxPrice){
        productRepository.getProductsByPrice(minPrice, maxPrice);
    }

    private List<Product> getProductsBySellerUser(User user){
        productRepository.getProductsBySellerUser(user);
    }
}
