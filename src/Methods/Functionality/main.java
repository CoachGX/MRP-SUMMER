package Methods.Functionality;

import java.util.*;
import Constants.Database.Constants;
import Products.Objects.Products;

public class main {

	
	
	private static int numbResponse;
	private static Object tempObj;

	public static void play() {
	
	
	while(true) {
	test();
	if(numbResponse == -1) 
		break;
	}
	printArr();
	
	}
  
  /*
   * 
   * 
   * 
   * 
   */
	
	static void findObjectName(String prodName) {
		//Isaac explicame este forloop
		for(int i = 0; i < Constants.pArr.size() ; i++) {
			 
			if(prodName.equalsIgnoreCase(Constants.pArr.get(i).getName())) {
				
				System.out.println(Constants.pArr.get(i));
				break;
				
			}
			if(i == Constants.pArr.size() - 1) {
				System.out.println("0");
			}
			
		}
		
		
		

	}
	static Object findObject(String prodName) {
		//Isaac explicame este forloop
		for(int i = 0; i < Constants.pArr.size() ; i++) {
			 
			if(prodName.equalsIgnoreCase(Constants.pArr.get(i).getName())) {
				
				Object tempObj = Constants.pArr.get(i);
				return  tempObj;
				
			}
		
		}
		return tempObj;
		
		
		

	}
	
	private static void printArr() {
		
		for(int i = 0; i < Constants.pArr.size(); i++) {
			System.out.println((i + 1) + ". " + Constants.pArr.get(i).getName() + ", " +
					Constants.pArr.get(i).getQuantity() + ", " + Constants.pArr.get(i).getCode());
		}
	}
	
	private static void test() {
		
		String tempName, tempCode;
		int tempQuantity;
		
		try {
		System.out.println("Presiona 1 para agregar otro producto \n"
				+ "Presiona 2 para buscar un producto");
		numbResponse = Constants.reader.nextInt();
		if(numbResponse == 1){
			
			System.out.println("¿Cuál es el nombre del producto?");
			tempName = Constants.reader.nextLine();
			tempName = Constants.reader.nextLine();
			
			System.out.println("¿Cuál es la cantidad del producto?");
			tempQuantity = Constants.reader.nextInt();
			
			System.out.println("¿Cuál es el codigo de el producto? (Si no tiene escribe 0)");
			tempCode = Constants.reader.nextLine();
			tempCode = Constants.reader.nextLine();
			
			
			Products x = new Products(tempName, tempQuantity, tempCode);
			
		}
		
		else if(numbResponse == 2){
			
			System.out.println("¿Cual es el nombre del producto?");
			String temp = Constants.reader.nextLine();
			temp = Constants.reader.nextLine();
			main.findObjectName(temp);
			
		}
		
		/*else if(numbResponse == 3) {
			
			System.out.println("¿Cual es el nombre del producto?");
			String temp = Constants.reader.nextLine();
			temp = Constants.reader.nextLine();
			tempObj = main.findObject(temp);
			tempO bj.products.changeQuantity;
			
		}
		*/
		else if(numbResponse == -1) {
			
			
			
		}
		else {
			
			System.out.println("Presiona uno de los numeros indicados");
			
		}
		
		} catch(RuntimeException e) {
			
			System.out.println("Presiona uno de los numeros indicados");
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		play();

	}

}