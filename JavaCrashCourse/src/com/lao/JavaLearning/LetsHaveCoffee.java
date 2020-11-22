package com.lao.JavaLearning;

public class LetsHaveCoffee {
	
	
	boolean CoffeeCupIsEmpty = true;
	
	boolean CoffeeMachineIsEmpyt = true;
	

	public static void main(String[] args) {
	
		
		LetsHaveCoffee coffee = new LetsHaveCoffee(); 
			
			if(coffee.CoffeeCupIsEmpty) {
				
				System.out.println("Fill Coffee");
				
				}else {
					
					System.out.println("Dont fill the coffee");
				}
		
		if(coffee.CoffeeMachineIsEmpyt) {
			
			System.out.println("Dont fill the coffee");
		}else {
			
			System.out.println("Fill the coffee");
		}

	}

}
