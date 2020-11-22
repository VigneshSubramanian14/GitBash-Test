package com.lao.JavaLearning;

public class Hero_withoutBreakSt {
	
	public String hero="Superman";
	
	//here you are not using break statement that is why when one condition is satisfying all are getting executed.
	
	//Check Hero_withBreakSt
	
	
	public void HeroOrNot() {
		
		switch (hero) {
		case "Superman":
			System.out.println("You have selected Superman");
			
		case "Spiderman":
			System.out.println("You have selected Spiderman");
		
			
		case "Batman":
			System.out.println("You have selected Batman");
		

		default:
			System.out.println("The hero which you have selected is not in this list");
		}
		
	}
	

	public static void main(String[] args) {
		
		Hero_withoutBreakSt breakSt = new Hero_withoutBreakSt();
		
		breakSt.HeroOrNot();
		

	}

}
