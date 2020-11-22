package com.lao.JavaLearning;

public class HeroNameGuess {

	String HeroName = "CaptainAmerica";
	
	
	
	public void NameGusser() {
		
		if(HeroName.equalsIgnoreCase("Ironman")) {
			
			System.out.println("You have guessed wrong");
			
			}else if(HeroName.equalsIgnoreCase("Captain America")){
			
				System.out.println("You have guessed it wrong");
				
			}else if(HeroName.equalsIgnoreCase("Captain America")) {
				
				System.out.println("You have guessed correctly it is captian america");
			}else {
				
				System.out.println("Guess is finished");
			}
	}
	


	public static void main(String[] args) {
		
		
		HeroNameGuess guess = new HeroNameGuess();
		
		guess.NameGusser();

	}

}
