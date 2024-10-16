package com.example.Projection;

import org.springframework.data.rest.core.config.Projection;

import com.example.entity.Customer;

@Projection(name = "fullCustomer",types = Customer.class)
public interface CustomerProjection  extends Projection{
	public Long getId();
	public String getName();
	public String getEmail();
	
	
	
}
