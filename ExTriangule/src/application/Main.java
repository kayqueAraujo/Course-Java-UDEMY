package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangule;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		retangule Rectangle = new retangule();
		
	
		System.out.println("Insert the width for triangule: ");
		Rectangle.width = sc.nextDouble();

		System.out.println("Insert the height for triangule: ");
		Rectangle.height = sc.nextDouble();
		
		System.out.printf("The area for triangule is: %.2f%n", Rectangle.Area());
		
		System.out.printf("The perimeter for triangule is: %.2f%n", Rectangle.Perimeter());
		
        System.out.printf("The diagonal for triangule is: %.2f%n", Rectangle.diagonal());
        
        
	}

}
