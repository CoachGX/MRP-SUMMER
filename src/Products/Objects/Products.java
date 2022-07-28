package Products.Objects;

import Constants.Database.Constants;
import java.util.Scanner;

public class Products {
	
	private String pName;
	private int pQuantity;
	private String pCode; 
	Scanner scan = new Scanner(System.in);
	
	public Products(String pName, int pQuantity) {
	
		this.pName = pName;
		this.pQuantity = pQuantity;
		Constants.pArr.add(this);
		
	}
	
	public Products(String pName, int pQuantity, String pCode) {
		
		this.pName = pName;
		this.pQuantity = pQuantity;
		this.pCode = pCode;
		Constants.pArr.add(this);
		
	}
	
	public String getName() {
		
		return pName;
		
	}
	
	public int getQuantity() {
		
		return pQuantity;
		
	}
	public int changeQuantity(){

		try {
			System.out.println("What has been the change in quantity");
		pQuantity =  pQuantity + scan.nextInt();


		} catch (Exception e) {
			System.out.println("Please put a whole number.");
		}
		return pQuantity;
	}
	public String getCode() {
		
		return pCode;
		
	}
	
	public String toString() {
		
		return "Buscaste el producto " + pName + ". Hay " + pQuantity + " disponibles y el codigo del producto es " + pCode;
		
	}
	
	

}