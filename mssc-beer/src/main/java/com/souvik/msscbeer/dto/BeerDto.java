package com.souvik.msscbeer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	
	private int id;
	private String beerName;
	private String beerStyle;
	private double upc;
	

}
