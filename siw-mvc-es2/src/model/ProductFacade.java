package model;

/**
 * Created by marcofaretra on 25/04/15.
 */

import java.util.*;

public class ProductFacade {
    private Map<Long,Product> products;

    public ProductFacade() {
        this.products=new HashMap<Long,Product>();
    }

    public Product createProduct(String name, String code, Float price, String description) {
        Product product = new Product(name,price,description,code);
        this.products.put(new Long(products.size()), product);
        return product;
    }

    public Product getProduct(Long id) {
        return this.products.get(id);
    }

    public List<Product> getAllProduct() {
        return new LinkedList<Product>(this.products.values());
    }

    public void updateProduct(Product product) {
        this.products.put(product.getId(),product);
    }

    public void deleteProduct(Long id) {
        this.products.remove(id);
    }
}
