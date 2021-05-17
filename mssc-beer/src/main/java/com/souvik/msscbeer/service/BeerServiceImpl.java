package com.souvik.msscbeer.service;

import org.springframework.stereotype.Service;

import com.souvik.msscbeer.dto.BeerDto;

@Service
public class BeerServiceImpl implements BeerService{

	@Override
	public BeerDto getBeerById(int beerId) {
	
		System.out.println("Reached service layer");
		BeerDto beer = new BeerDto();
		beer.setId(beerId);
		beer.setBeerName("Kingfisher");
		beer.setBeerStyle("Bottle");
		beer.setUpc(100.50);
		return beer;
	}

}
