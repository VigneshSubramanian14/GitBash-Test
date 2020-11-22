package com.lao.JavaLearning;

public class Animal {

	
	String animal_group;
	
	String animal_house;
	
	
	
	Animal(String name , String type){
		
		animal_group = name;
		
		animal_house = type;
		
		}
	
	
	public void sayaboutAnimal() {
		
		System.out.println("This is animal name"+animal_group + "This is animaltype"+animal_house);
	}
	
	
	public static void main(String[] args) {
		
		Animal animal = new Animal("lion", "king");
		
		animal.sayaboutAnimal();
	
	}

}
