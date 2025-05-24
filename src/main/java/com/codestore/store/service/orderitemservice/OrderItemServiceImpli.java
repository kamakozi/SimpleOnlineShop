package com.codestore.store.service.orderitemservice;

import com.codestore.store.entity.OrderItemEntity;
import com.codestore.store.repository.OrderItemRepository;
import com.codestore.store.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpli implements OrderItemService{
    public final  OrderItemRepository orderItemRepository;

    public OrderItemServiceImpli(OrderItemRepository orderItemRepository){
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public List<OrderItemEntity> getAllOrderedItems(){
        return orderItemRepository.findAll();
    }

    @Override
    public OrderItemEntity getOrderItemById(Long id){
        return orderItemRepository.findById(id).orElse(null);
    }

    @Override
    public OrderItemEntity addItem(OrderItemEntity order){
        return orderItemRepository.save(order);
    }

    @Override
    public void  deleteOrderItem(Long id){
        orderItemRepository.deleteById(id);
    }
}
