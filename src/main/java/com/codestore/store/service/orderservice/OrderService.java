package com.codestore.store.service.orderservice;

import com.codestore.store.entity.OrderEntity;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrderService {
    List<OrderEntity> getAllOrders();
    OrderEntity getOrderById(Long id);
    OrderEntity saveOrder(OrderEntity order);
    void deleteOrder(Long id);
}
