package Products.Objects;

import Constants.Database.Constants;


public class Products {
	
	private String name;
	private int quantity;
	private String code; 
	
	public Products(String name, int quantity) {
	
		this.name = name;
		this.quantity = quantity;
		Constants.mainArr.add(this);
		
	}
	
	public Products(String name, int quantity, String code) {
		
		this.name = name;
		this.quantity = quantity;
		this.code = code;
		Constants.mainArr.add(this);
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getQuantity() {
		
		return quantity;
		
	}
	
	public String getCode() {
		
		return code;
		
	}
	
	public String toString() {
		
		return "Buscaste el producto " + name + ". Hay " + quantity + " disponibles y el codigo del producto es " + code;
		
	}
	
	

}