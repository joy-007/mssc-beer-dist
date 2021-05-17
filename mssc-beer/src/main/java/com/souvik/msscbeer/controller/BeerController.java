package com.souvik.msscbeer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.msscbeer.dto.BeerDto;
import com.souvik.msscbeer.service.BeerService;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
	
	@Autowired
	private BeerService beerService;
	
	/*public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}*/

	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") int beerId){
				
		return new ResponseEntity<>(beerService.getBeerById(beerId),HttpStatus.OK);
		
	}

}
