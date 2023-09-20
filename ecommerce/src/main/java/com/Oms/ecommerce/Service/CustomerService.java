package com.Oms.ecommerce.Service;

import java.util.List;

import com.Oms.ecommerce.Exception.CustomerException;
import com.Oms.ecommerce.Model.EcommereceModelCustomer;


public interface CustomerService
{

	public EcommereceModelCustomer addCustomer(EcommereceModelCustomer customer) throws CustomerException;

	public EcommereceModelCustomer updateCustomer(EcommereceModelCustomer customer) throws CustomerException;

	public EcommereceModelCustomer remove(Integer customerId) throws CustomerException;

	public List<EcommereceModelCustomer> viewAllCustomer() throws CustomerException;


}
