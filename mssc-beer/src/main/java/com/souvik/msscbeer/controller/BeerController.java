package com.souvik.msscbeer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
import com.souvik.msscbeer.service.BeerService;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
	
	@Autowired
	private BeerService beerService;
	
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") int beerId){
				
		
		return new ResponseEntity<>(beerService.getBeerById(beerId),HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<BeerDto> saveBeer(@RequestBody BeerDto beerDto){
		
		System.out.println("add logger");
		
		beerService.saveBeer(beerDto);
		
		return new ResponseEntity<BeerDto>(HttpStatus.CREATED);
	}
	
	@PatchMapping("/{beerId}")
	public ResponseEntity<BeerDto> updateBeerById(@PathVariable("beerId") int beerId,@RequestBody BeerDto beerDto){
		
		beerService.updateBeer(beerId,beerDto);
		
		return new ResponseEntity<BeerDto>(HttpStatus.OK);
	}
	
	
	@PatchMapping("/{beerId}")
	public ResponseEntity<BeerDto> deleteBeer(@PathVariable("beerId") int beerId){
		
		beerService.deleteBeerById(beerId);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	

}
