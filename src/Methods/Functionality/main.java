package Methods.Functionality;

import java.util.*;
import Constants.Database.Constants;
import Products.Objects.Products;

public class main {

	
	
	private static int numbResponse;
	private static Products tempObj;

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
	static Products findObject(String prodName) {
		//Isaac explicame este forloop
		for(int i = 0; i < Constants.pArr.size() ; i++) {
			 
			if(prodName.equalsIgnoreCase(Constants.pArr.get(i).getName())) {
				
				return Constants.pArr.get(i);
				
			}
		
		}
		return null;
		
		
		

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
		System.out.println("Presiona 1 para agregar otro producto. \n"
				+ "Presiona 2 para buscar un producto. \n" + "Presiona 3 para cambiar la cantidad de un producto.");
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
		
		else if(numbResponse == 3) {
			
			System.out.println("¿Cual es el nombre del producto?");
			String temp = Constants.reader.nextLine();
			temp = Constants.reader.nextLine();
			
			tempObj = main.findObject(temp);
			int num = tempObj.getQuantity();

			if(tempObj != null) {
				
				System.out.println("En este momento hay: " + num + " unidades de el producto " + temp + "\n¿A que cantidad deseas cambiar este numero?");
				num = Constants.reader.nextInt();
				main.findObject(temp).changeQuantity(num);
				printArr();
			}
			else
			System.out.println("No se ha encontrado el producto con nombre: " + temp + " porfavor intentelo otra vez");
			
			
		}
		
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