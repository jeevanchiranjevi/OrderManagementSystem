package com.Oms.ecommerce.Implementation;

import java.lang.StackWalker.Option;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Oms.ecommerce.Exception.CustomerException;
import com.Oms.ecommerce.Model.EcommerceModel;
import com.Oms.ecommerce.Model.EcommereceModelCustomer;
import com.Oms.ecommerce.Repositry.CustomerRepo;
import com.Oms.ecommerce.Repositry.OrderRepo;
import com.Oms.ecommerce.Service.OrderException;
import com.Oms.ecommerce.Service.OrderService;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional;
@Service
public class OrderServiceImplementation implements OrderService
{
	@Autowired
	private OrderRepo oRepo;
	@Autowired
	private CustomerRepo customerRepo;
	@Override
	public EcommerceModel addOrder(Integer cid) throws com.Oms.ecommerce.Exception.OrderException {
		Optional<EcommereceModelCustomer> opt = customerRepo.findById();
		if (opt.isEmpty()) {
			throw new CustomerException("Customer not found");
		}
		EcommerceModel o = new EcommerceModel();

		o.setDate(LocalDateTime.now());
		o.setOrderStatus("Pending");
	}

	@Override
	public EcommerceModel updateOrder(Order order) throws com.Oms.ecommerce.Exception.OrderException {
		EcommerceModel o = oRepo.findById(order.getOrderId()).orElseThrow(() -> new OrderException("Order not found"));
		if (o != null) {
			oRepo.save(null);
		}
		return o;
	}

	@Override
	public EcommerceModel viewOrder(Integer orderId) throws com.Oms.ecommerce.Exception.OrderException {
		Optional<EcommerceModel> o = oRepo.findBy(orderId);
		if (o.isPresent()) {
			return o.get();
		} else {
			throw new com.Oms.ecommerce.Exception.OrderException("order not present!!");
		}
	}

	@Override
	public List<EcommerceModel> viewAllOrder() throws com.Oms.ecommerce.Exception.OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EcommerceModel> viewAllOrdersByUserId(Integer userId) throws com.Oms.ecommerce.Exception.OrderException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
