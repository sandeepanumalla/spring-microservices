package demo.productmicrosevice.service;

import demo.productmicrosevice.model.Product;
import org.springframework.data.domain.Pageable;

import java.util.*;

public interface ProductService {
        Product createProduct(Product product);
        Product getProductById(long productId);
        List<Product> getAllProducts(Pageable pageable);
        Product updateProduct(long productId, Product updatedProduct);
        void deleteProduct(long productId);

}
