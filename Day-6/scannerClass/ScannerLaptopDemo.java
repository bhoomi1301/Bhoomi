package com.scannerClass;

import java.util.Scanner;

public class ScannerLaptopDemo {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		int option;
		
		do {
			System.out.println("Enter Option: ");
			System.out.println("1-Add");
			System.out.println("2-Subtract");
			System.out.println("3-Multiply");
			System.out.println("4-Even/OddNumber");
			System.out.println("5-Quit");
			
            option = s1.nextInt();	
            
		switch(option) {
		
		case 1:
			System.out.println("Enter two numbers to be added");
			    int num1 = s1.nextInt();
				int num2 = s1.nextInt();
				int add = num1 + num2;
				System.out.println("The result is: " +add);
			break;
			
		case 2:
			System.out.println("Enter two numbers to be subtracted");
				 num1 = s1.nextInt();
				 num2 = s1.nextInt();
				 int sub = num1 - num2;
				System.out.println("The result is: " +sub);
			break;
			
		case 3:
			System.out.println("Enter two numbers to be multiplied");
				 num1 = s1.nextInt();
				 num2 = s1.nextInt();
				int mul = num1 * num2;
				System.out.println("The result is: " +mul);
			break;
			
		case 4:
			System.out.println("Enter number to check even or odd");
			    int num = s1.nextInt();
				if(num%2 == 0) {
					System.out.println("The number is even");
				}
				else {
					System.out.println("The number is odd");
				}
				break;
			
		case 5:
			System.out.println("Terminated");
			break;
			
			default:
				System.out.println("The number is not between 1 to 5");
			    break;
		    }
		
		}while(option != 5);
		
		s1.close();
	}
		
		
}

