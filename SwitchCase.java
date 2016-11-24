package nov9;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
	       int say;
	        do{

			int b;
		
			Scanner venky = new Scanner(System.in);
			 
			System.out.println(" enter the choice");
			System.out.println("press 1 for addition");
			System.out.println("press 2 for subraction");
			System.out.println("press 3 for multiply");
			System.out.println("press 4 for division");
			int choice =venky.nextInt();
			System.out.println("enter a value");
			a=venky.nextInt();
			System.out.println("enter b value ");
			b=venky.nextInt();
		
			if(choice==1){
				int add=a+b;
			System.out.println("enter addition value:"+add);
			}else
			if(choice==2){
				float sub=a-b;
				System.out.println("enter sub value:"+sub);
			}else
			if (choice==3){
				float mul=a*b;
				System.out.println("enter mul value:"+mul);
				}
			else
			if(choice==4){
				int div = a/b;
				System.out.println("enter div value:"+div);
				}
			System.out.println("do you want to continue");
			System.out.println("say 1 for yes or 2 for no");
			say = venky.nextInt();
			}while (say== 1);
		      
		        
			

			
				
		}

		
			

	}

