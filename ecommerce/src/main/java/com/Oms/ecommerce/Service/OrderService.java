package com.Oms.ecommerce.Service;

import java.util.List;

import javax.persistence.criteria.Order;

import com.Oms.ecommerce.Exception.OrderException;
import com.Oms.ecommerce.Model.EcommerceModel;

public interface OrderService
{
	public EcommerceModel addOrder(Integer cid) throws OrderException;

	public EcommerceModel updateOrder(EcommerceModel order) throws OrderException;

	public EcommerceModel viewOrder(Integer orderId) throws OrderException;

	public List<EcommerceModel> viewAllOrder() throws OrderException;

	public List<EcommerceModel> viewAllOrdersByUserId(Integer userId) throws OrderException;


}
