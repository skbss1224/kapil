package kabil;

import java.util.Scanner;

public class control2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("you can watch this film");
			System.out.println("enter your amount");
			int amount=sc.nextInt();
			if(amount>=200) {
				System.out.println("you can buy this popcorn");
				int bal = amount-200;
				System.out.println("your balance amount is "+bal);
			}
			else {
				System.out.println("insufiecient amount");
			}
		}
		else {
			System.out.println("you can't watch this film");
		}
	}

}
