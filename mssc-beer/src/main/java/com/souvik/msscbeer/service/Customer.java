package com.souvik.msscbeer.service;

import java.util.UUID;

import com.souvik.msscbeer.dto.CustomerDto;

public interface Customer {
	
	
	public CustomerDto getCustomerDto(String customerId);

	public void saveCustomer(CustomerDto custDto);

	public void updateCustomer(int custId, CustomerDto custDto);

	public void deleteCustomerById(int customerId);

}
