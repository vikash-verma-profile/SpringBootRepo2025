package com.demo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.demo.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	@GetMapping
	public String getOrders(){
		return "List Of Orders";
	}
	@GetMapping("/process")
	public String process(){
		return "List Of Orders";
	}
	
	
}
