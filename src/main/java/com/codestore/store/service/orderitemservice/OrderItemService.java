package com.codestore.store.service.orderitemservice;

import com.codestore.store.entity.OrderItemEntity;

import java.util.List;

public interface OrderItemService {
    List<OrderItemEntity> getAllOrderedItems();
    OrderItemEntity getOrderItemById(Long id);
    OrderItemEntity addItem(OrderItemEntity orderItem);
    void deleteOrderItem(Long id);

}
