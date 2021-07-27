package de.neuefische.demoneuefische.repositories;

import de.neuefische.demoneuefische.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Repository
public class ProductRepository {

    private List<Product> products = new ArrayList<>();


    public ProductRepository() {
        products.add(new Product("tomate", "1"));
        products.add(new Product("fisch", "2"));
        products.add(new Product("kamera", "3"));
        products.add(new Product("ei", "4"));
    }

    public List<Product> list() {
        return Collections.unmodifiableList(products);
    }

}
