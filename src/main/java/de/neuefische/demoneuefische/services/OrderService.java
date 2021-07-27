package de.neuefische.demoneuefische.services;

import de.neuefische.demoneuefische.model.Order;
import de.neuefische.demoneuefische.model.Product;
import de.neuefische.demoneuefische.repositories.OrderRepository;
import de.neuefische.demoneuefische.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }


    public List<Order> listAllOrders() {
        return orderRepository.list();
    }

    public Optional<Order> findById(String id) {
        return orderRepository.findById(id);
    }

    public Order createNewOrder(Order order) {
        for (Product product : order.getProductList()) {
            if (!productRepository.list().contains(product)) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
        }
        return orderRepository.createNewOrder(order);
    }
}
