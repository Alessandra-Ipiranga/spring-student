package de.neuefische.demoneuefische.repositories;

import de.neuefische.demoneuefische.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class OrderRepository {

    private List<Order> orders = new ArrayList<>();

    public List<Order> list(){
        return Collections.unmodifiableList(orders);
    }
}
