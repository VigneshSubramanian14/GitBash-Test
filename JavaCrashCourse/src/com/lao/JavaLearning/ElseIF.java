package com.lao.JavaLearning;

public class ElseIF {
	
	String bike = "Duke";
	
	
	public void BikeList() {
		
		if(bike.equalsIgnoreCase("Royal Enfield")) {
			
			System.out.println("You have guessed it about RoyalEnfield");
		}
		else if(bike.equalsIgnoreCase("HeroHonda")) {
			
			System.out.println("You have guessed HeroHonda");
		}
	
		else if(bike.equalsIgnoreCase("Yamaha")) {
			System.out.println("You have guessed Yamaha");
		}
		else {
			System.out.println("You have guessed a different bike");
		}
	
	}
	
	public static void main(String[] args) {
	
		ElseIF elseIF = new ElseIF();
		
		elseIF.BikeList();
		
	}

}
