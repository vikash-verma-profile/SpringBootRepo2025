package com.demo.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.demo.order_service.model.*;

import com.demo.order_service.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	@GetMapping
	public List<Order> getOrders(){
		return  orderService.getAllOrders();
	}
	@DeleteMapping("/{id}")
	public String deleteOrder(@PathVariable Long id){
		orderService.deleteOrder(id);
		return "order deleted !";
	}
	@PostMapping
	public Order addOrder(@RequestBody Order order){
		return  orderService.saveOrder(order);
	}
	
	
}
