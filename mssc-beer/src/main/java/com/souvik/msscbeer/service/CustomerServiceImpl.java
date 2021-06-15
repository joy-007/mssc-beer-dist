package com.souvik.msscbeer.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.souvik.msscbeer.dto.CustomerDto;

@Service
public class CustomerServiceImpl implements Customer {

	@Override
	public CustomerDto getCustomerDto(String customerId) {
		
		
		CustomerDto customer = new CustomerDto();
		customer.setUid(customerId);
		customer.setName("Souvik Bhattacharjee");
		return customer;
	}

	@Override
	public void saveCustomer(CustomerDto custDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(int custId, CustomerDto custDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomerById(int customerId) {
		// TODO Auto-generated method stub
		
	}

}
