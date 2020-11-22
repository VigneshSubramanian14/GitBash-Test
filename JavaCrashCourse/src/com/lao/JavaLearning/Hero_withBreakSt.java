package com.lao.JavaLearning;

public class Hero_withBreakSt {

	public String hero = "Superman";

	public void HeroOrNot() {
		
		switch (hero) {
		case "Superman":
		System.out.println("You have selected Superman");
		
			break;
			
	case "Spiderman":
		System.out.println("You have selected Spiderman");
		break;
			
			
			case "Hulk":
			
			System.out.println("You have selected Hulk");
			
			break;
			
			
			case "Ben10":
			
			System.out.println("You have selected Ben10");
			
            break;
            
		default:
		
			System.out.println("You have not selected");
		}
	}
	public static void main(String[] args) {
	
		Hero_withBreakSt breakSt = new Hero_withBreakSt();
		
		breakSt.HeroOrNot();

	}

}
