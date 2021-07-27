package de.neuefische.demoneuefische.repositories;

import de.neuefische.demoneuefische.model.Order;
import de.neuefische.demoneuefische.model.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class OrderRepository {

    private final List<Order> orders;

    public OrderRepository() {
        orders = new ArrayList<>(
                List.of(new Order(
                        List.of(new Product("tomate", "1")), "1")
                )
        );
    }

    public List<Order> list() {
        return Collections.unmodifiableList(orders);
    }

    public Optional<Order> findById(String id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return Optional.of(order);
            }
        }
        return Optional.empty();
    }

    public Order createNewOrder(Order order) {
        String id = UUID.randomUUID().toString();
        Order newOrder = new Order(order.getProductList(), id);
        orders.add(newOrder);
        return newOrder;
    }
}
