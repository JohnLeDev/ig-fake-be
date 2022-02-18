package com.energycompany.ntcpetroleum.service;

import java.util.List;

import com.energycompany.ntcpetroleum.model.Order;

public interface ManagerService {
    List<Order> getAllOrder() ;
    void addOrder( Order order) ;
    void deleteOrder(Order order );
    void updateOrder (Order order );
}
