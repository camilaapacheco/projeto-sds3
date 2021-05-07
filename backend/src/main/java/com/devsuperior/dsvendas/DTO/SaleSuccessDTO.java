package com.devsuperior.dsvendas.DTO;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long deals;
	private Long visited;
	
	public SaleSuccessDTO(Seller seller,  Long visited, Long deals) {
		sellerName = seller.getName();
		this.deals = deals;
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public SaleSuccessDTO () {}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public SaleSuccessDTO(Seller seller, Double sum) {
		
		this.sellerName = seller.getName();
		
	}
	
}
