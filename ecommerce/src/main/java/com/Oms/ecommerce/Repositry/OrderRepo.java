package com.Oms.ecommerce.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Oms.ecommerce.Model.EcommerceModel;

@Repository
public interface OrderRepo extends JpaRepository<EcommerceModel, Integer>
{

}
