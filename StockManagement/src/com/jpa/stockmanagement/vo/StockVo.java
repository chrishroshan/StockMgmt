package com.jpa.stockmanagement.vo;

public class StockVo {

	public int productid;
	public String productname;
	public int price_piece;
	public int quantity;
	public int weight;
	public String create_time;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice_piece() {
		return price_piece;
	}
	public void setPrice_piece(int price_piece) {
		this.price_piece = price_piece;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	
	
	
}
