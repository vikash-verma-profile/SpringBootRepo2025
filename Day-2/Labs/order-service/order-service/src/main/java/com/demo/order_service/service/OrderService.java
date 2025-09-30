package com.demo.order_service.service;

import org.springframework.stereotype.Service;
import com.demo.order_service.model.Order;
import com.demo.order_service.repository.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repo;
	
	public List<Order> getAllOrders(){
		return repo.findAll();
	}

	public Order saveOrder(Order order) {
		return repo.save(order);
	}
	public void deleteOrder(Long id) {
		repo.deleteById(id);
	}
	public String proccessOrder() {
		return "Order Processed !";
	}
}
