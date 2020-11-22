package com.lao.JavaLearning;

public class Example_String {

	public static void main(String[] args) {
		
		String name = "Vignesh";
		int number = 4;
		
		//System.out.println(String.valueOf(number));
		
		/*System.out.println(name.trim());
		
		System.out.println(name);*/
		
		
		//System.out.println(name.concat("Subramanian"));
		
		//System.out.println(name.replaceAll("Vignesh", "BalaVignesh"));
		
		//System.out.println(name.concat("Vignesh"));
		
		System.out.println(name.join("-","Bala","Vignesh ") + name.join("/", "30","10","1995"));

	}

}
