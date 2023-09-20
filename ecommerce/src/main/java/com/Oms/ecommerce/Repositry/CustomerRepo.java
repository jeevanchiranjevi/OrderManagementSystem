package com.Oms.ecommerce.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Oms.ecommerce.Model.EcommerceModel;
import com.Oms.ecommerce.Model.EcommereceModelCustomer;

@Repository
public interface CustomerRepo extends JpaRepository<EcommereceModelCustomer, Integer>
{
	@Query("select c.orders from Customer c where c.cId=?1")
	public List<EcommerceModel> getAllOrderByCid(Integer cId);

	public  EcommereceModelCustomer  findByEmail(String email);
}
