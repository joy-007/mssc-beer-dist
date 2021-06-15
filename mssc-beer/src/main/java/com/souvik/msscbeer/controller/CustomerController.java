package com.souvik.msscbeer.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.msscbeer.dto.BeerDto;
import com.souvik.msscbeer.dto.CustomerDto;
import com.souvik.msscbeer.service.Customer;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
	
	@Autowired
	private Customer customerService;
	
	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") String customerId){
		
		return new ResponseEntity<>(customerService.getCustomerDto(customerId),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto custDto){
		
		customerService.saveCustomer(custDto);
		
		return new ResponseEntity<CustomerDto>(HttpStatus.CREATED);
	}
	
	@PatchMapping("/{customerId}")
	public ResponseEntity<CustomerDto> updateBeer(@PathVariable("customerId") int customerId,@RequestBody CustomerDto custDto){
		
		customerService.updateCustomer(customerId,custDto);
		
		return new ResponseEntity<CustomerDto>(HttpStatus.OK);
	}
	
	
	@PatchMapping("/{customerId}")
	public ResponseEntity<CustomerDto> deleteBeer(@PathVariable("customerId") int customerId){
		
		customerService.deleteCustomerById(customerId);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
