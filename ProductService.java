package BMS;

import java.util.HashMap;

public class ProductService {
    private HashMap<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product getProduct(int id) {
        return products.get(id);
    }

    public HashMap<Integer, Product> getAllProducts() {
        return products;
    }
}

