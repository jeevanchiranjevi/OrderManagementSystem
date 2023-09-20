package com.Oms.ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Oms.ecommerce.Exception.CustomerException;
import com.Oms.ecommerce.Exception.OrderException;
import com.Oms.ecommerce.Model.EcommerceModel;
import com.Oms.ecommerce.Service.OrderService;

@RestController
@RequestMapping("/EcommerceModel")
public class OrderController 
{
	@Autowired
	private OrderService oService;
	@PostMapping("/add")
	public ResponseEntity<EcommerceModel> addOrder(@RequestParam("customerId") Integer customerId)
			throws OrderException {
		return new ResponseEntity<EcommerceModel>(oService.addOrder(customerId), HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<EcommerceModel> updateOrder(@RequestBody EcommerceModel order) throws OrderException {
		return new ResponseEntity<EcommerceModel>(oService.updateOrder(order), HttpStatus.OK);
	}
	
	@GetMapping("/view/{id}")
	public ResponseEntity<EcommerceModel> viewOrderById(@PathVariable("id") Integer orderId) throws OrderException {
		return new ResponseEntity<EcommerceModel>(oService.viewOrder(orderId), HttpStatus.OK);
	}
	@GetMapping("/view")
	public ResponseEntity<List<EcommerceModel>> viewAllOrder() throws OrderException {
		return new ResponseEntity<List<EcommerceModel>>(oService.viewAllOrder(), HttpStatus.OK);
	}
	@GetMapping("/view/{userId}")
	public ResponseEntity<List<EcommerceModel>> viewOrderByUserId(@PathVariable("userId") Integer userId)
			throws OrderException {
		return new ResponseEntity<List<EcommerceModel>>(oService.viewAllOrdersByUserId(userId), HttpStatus.OK);
	}

}
