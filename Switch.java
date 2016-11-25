package nOv9;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Switch button = new Switch();
				Scanner venky = new Scanner(System.in);
				int a;
				int b;
				int say;
				
				do{//do loop start from here
				int results;
				System.out.println("enter the choice");
			
				System.out.println("press 1 for add:");
				
				System.out.println("press 2 for sub:");
			
				System.out.println("press 3 for mul:");
				
				System.out.println("press 4 for div:");
				int choice = venky.nextInt();
				System.out.println("enter a value:");
				int avalue =venky.nextInt();
				System.out.println("enter b value:");
				int bvalue =venky.nextInt();
				switch(choice)
				{
				case 1:
					int add=avalue+bvalue;
					System.out.println("add value is:"+add);
					break;
				
				case 2:
					 float sub =avalue-bvalue;
					 System.out.println("sub is:"+sub);
					 break;
				
				case 3:
					int mul = avalue*bvalue;
					System.out.println("mul is:"+mul);
					break;
					
				
				case 4:
					double div =avalue/bvalue;
					System.out.println("div is:"+div);
					break;
				}
				
				System.out.println("continue");
				System.out.println("say 1 for yes or 2 for no");
				say=venky.nextInt();
				}while (say==1);
			


				}
				
			
			
				

	}


