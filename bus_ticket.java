package kabil;

import java.util.Scanner;

public class bus_ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your place:");
		String place=sc.nextLine();
		if(place.equals("chennai")) {
			System.out.println("you are slected "+place);
			System.out.println("enter your bus type:");
			String type=sc.nextLine();
			if(type.equals("ordinary")) {
				System.out.println("you are slected "+type);
				System.out.println("enter your amount:");
				int amount=sc.nextInt();
				if(amount>=150) {
					System.out.println("you selected "+type+" 1 ticket resrved");
					int bal = amount-150;
					System.out.println("your balance amount is "+bal);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(type.equals("delux")) {
				System.out.println("you are slected "+type);
				System.out.println("enter your amount:");
				int amount=sc.nextInt();
				if(amount>=250) {
					System.out.println("you selected "+type+" 1 ticket resrved");
					int bal = amount-250;
					System.out.println("your balance amount is "+bal);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(type.equals("superdelux")) {
				System.out.println("you are slected "+type);
				System.out.println("enter your amount:");
				int amount=sc.nextInt();
				if(amount>=350) {
					System.out.println("you selected "+type+" 1 ticket resrved");
					int bal = amount-350;
					System.out.println("your balance amount is "+bal);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(type.equals("sleeper")) {
				System.out.println("you are slected "+type);
				System.out.println("enter your amount:");
				int amount=sc.nextInt();
				if(amount>=450) {
					System.out.println("you selected "+type+" 1 ticket resrved");
					int bal = amount-450;
					System.out.println("your balance amount is "+bal);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else {
				System.out.println("Ac bus service not available");
			}
			
		}
		else if(place.equals("coimbatore")) {
			System.out.println("you are slected "+place);
			System.out.println("enter your bus type:");
			String type=sc.nextLine();
			if(type.equals("ordinary")) {
				System.out.println("you are slected "+type);
				System.out.println("enter your amount:");
				int amount=sc.nextInt();
				if(amount>=100) {
					System.out.println("you selected "+type+" 1 ticket resrved");
					int bal = amount-100;
					System.out.println("your balance amount is "+bal);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(type.equals("delux")) {
				System.out.println("you are slected "+type);
				System.out.println("enter your amount:");
				int amount=sc.nextInt();
				if(amount>=200) {
					System.out.println("you selected "+type+" 1 ticket resrved");
					int bal = amount-200;
					System.out.println("your balance amount is "+bal);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(type.equals("superdelux")) {
				System.out.println("you are slected "+type);
				System.out.println("enter your amount:");
				int amount=sc.nextInt();
				if(amount>=300) {
					System.out.println("you selected "+type+" 1 ticket resrved");
					int bal = amount-300;
					System.out.println("your balance amount is "+bal);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else if(type.equals("sleeper")) {
				System.out.println("you are slected "+type);
				System.out.println("enter your amount:");
				int amount=sc.nextInt();
				if(amount>=400) {
					System.out.println("you selected "+type+" 1 ticket resrved");
					int bal = amount-400;
					System.out.println("your balance amount is "+bal);
				}
				else {
					System.out.println("insuffiecient amount");
				}
			}
			else {
				System.out.println("Ac bus service not available");
			}
			
		}
		else {
			System.out.println("only two places available chennai and coimbatore");
		}
	}

}
