package de.neuefische.demoneuefische.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Order {

    private final List<Product> products;
    private final String id;

    public Order(List<Product> products, String id) {
        this.products = products;
        this.id = id;
    }

    public List<Product> getProductList() {
        return Collections.unmodifiableList(products);
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(products, order.products) && Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, id);
    }
}
