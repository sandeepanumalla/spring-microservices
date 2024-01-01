package demo.productmicrosevice.service;

import demo.productmicrosevice.model.Product;
import demo.productmicrosevice.repository.ProductRepository;

import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts(Pageable pageable) {
        Page<Product> page = productRepository.findAll(pageable);
        return page.getContent();
    }

    @Override
    public Product updateProduct(long productId, Product updatedProduct) {
        return null;
    }

    @Override
    public void deleteProduct(long productId) {

    }
}
