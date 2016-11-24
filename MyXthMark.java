package java.basic;

import java.util.Scanner;

public class MyXthMark {

public static void main(String[] args) {
				// TODO Auto-generated method stub
		     MyXthMark mark=new  MyXthMark();
		     Scanner joseph =new Scanner(System.in);
		     int tamil,english,maths,science,scoial;
		     System.out.print("Enter tamil marks=");
		     tamil=joseph.nextInt();
		     System.out.print("Enter english marks=");
		     english=joseph.nextInt();
		     System.out.print("Enter maths marks=");
		     maths=joseph.nextInt();
		     System.out.print("Enter science marks=");
		     science =joseph.nextInt();
		     System.out.print("Enter scoial marks=");
		     scoial=joseph.nextInt();
		     int Total=mark.add( tamil,english,maths,science,scoial);
		    mark.avg( Total);
		     System.out.println("10th Mark Total is=:"+ mark.add( tamil,english,maths,science,scoial));
		     System.out.println("10th Mark avg is="+ mark.avg( Total));
			}
			private int add( int tamil,int english,int maths,int science,int scoial){
				int total= (tamil+english+maths+science+scoial);
				
				return total;
			}

			private float avg( int Total){
				float avgtotal=(Total)/5;
				if(avgtotal>60){
					System.out.println("first class");
					if(avgtotal<60){
						System.out.println("second class");
						
					}
					else if(avgtotal>50){
						System.out.println("pass");
					}
					else{
						System.out.println("RA");
						
						
					}
				}
					
				
				return avgtotal;
				
				
				
			
				
				}
				
			


	}
