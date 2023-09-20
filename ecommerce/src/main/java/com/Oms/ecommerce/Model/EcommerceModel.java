package com.Oms.ecommerce.Model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.apache.tomcat.jni.Address;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
@Entity
@Data
public class EcommerceModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderId;
	private LocalDateTime date;
	private String orderStatus;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private EcommereceModelCustomer customer;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public EcommereceModelCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(EcommereceModelCustomer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
