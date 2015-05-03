package it.uniroma3.model;

/**
 * Created by marcofaretra on 25/04/15.
 */

import java.util.*;

public class ProductFacade {

    private Map<Long, Product> products;

    public ProductFacade()  {
        this.products = new HashMap<Long, Product>();
        Product product = new Product("SDON", new Float(12.1), "description of SDON", "AA-00-11");
        product.setId(new Long(1));
        this.products.put(product.getId(), product);

        product = new Product("ADAS", new Float(10.0), "description of ADAS", "BB-11-22");
        product.setId(new Long(2));
        this.products.put(product.getId(), product);

        product = new Product("DANH", new Float(20.5), "description of DANH", "CC-22-33");
        product.setId(new Long(3));
        this.products.put(product.getId(), product);
    }

    public Product createProduct(String name, String code, Float price,
                                 String description) {
        // TODO Auto-generated method stub
        Product product = new Product(name, price, description, code);
        this.products.put(new Long(products.size()), product);
        //TO COMPLETE should call a JPA persist method
        return product;
    }

    public Product getProduct(Long id) {
        // TODO
        return products.get(id);
    }

    public List<Product> getAllProducts() {
        //TODO
        return new LinkedList<Product>(products.values());
    }

    public void updateProduct(Product product) {
        //TODO
        products.put(product.getId(), product);
    }

    public void deleteProduct(Long id) {
        //TODO
        products.remove(id);
    }


}
