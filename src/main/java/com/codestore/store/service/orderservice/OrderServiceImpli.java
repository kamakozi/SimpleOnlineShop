package com.codestore.store.service.orderservice;

import com.codestore.store.entity.OrderEntity;
import com.codestore.store.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpli implements OrderService{
    private final OrderRepository orderRepository;

    public OrderServiceImpli(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderEntity> getAllOrders(){
        return orderRepository.findAll();
    }

    public OrderEntity getOrderById(Long id){
        return orderRepository.findById(id).orElse(null);
    }

    public OrderEntity saveOrder(OrderEntity order){
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}
