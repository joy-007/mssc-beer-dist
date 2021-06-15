package com.souvik.msscbeer.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

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
	private Long upc;
	private BigDecimal price;
	private Integer quantityOnHand;
	private OffsetDateTime createDate;
	private OffsetDateTime lastModifiedDate;
	
	

}
