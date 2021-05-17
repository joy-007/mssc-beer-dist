package com.souvik.msscbeer.service;

import org.springframework.stereotype.Component;

import com.souvik.msscbeer.dto.BeerDto;


public interface BeerService {
	
	BeerDto getBeerById(int beerId);

}
