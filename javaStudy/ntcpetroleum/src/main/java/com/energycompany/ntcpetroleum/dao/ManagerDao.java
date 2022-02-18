package com.energycompany.ntcpetroleum.dao;

import java.util.List;

import com.energycompany.ntcpetroleum.model.Order;

public interface ManagerDao {
    List<Order> getAllOrder() ;
    void addOrder( Order order) ;
    void deleteOrder(Order order );
    void updateOrder (Order order );
    void addShowMangerID(String id);
  
}
