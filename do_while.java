package kabil;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number=1;
//		while(number <=0) {
//			System.out.println(number);
//			number++;
//		}
//		do {
//			System.out.println(number);
//			number++;
//		}
//		while(number<=0);
//		System.out.println(number);
		
//		int i=1,n=5;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=n);
		
		
//		int sum=0;
//		int number=0;
//		Scanner input=new Scanner(System.in);
//		do {
//			sum+=number;
//			System.out.println("Enter a number");
//			number=input.nextInt();
//		}while(number>=0);
//		System.out.println("sum="+sum);
//		input.close();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("tell us start end to find prime numbers:");
		int start=scan.nextInt();
		System.out.println("tell us end value: ");
		int end=scan.nextInt();
		/*
		 * do {
		 * if(start==2||start==3||start==5||start==7||start%2!=0&&start%3!=0&&start%5!=0
		 * &&start%7!=0) { System.out.println(start+" is prime"); } start++;
		 * }while(start<=end);
		 */
		/*
		 * for(;start<=end;start++) {
		 * if(start==2||start==3||start==5||start==7||start%2!=0&&start%3!=0&&start%5!=0
		 * &&start%7!=0) { System.out.println(start+"is prime"); } }
		 */
		
		while(start<=end) {
			if(start==2||start==3||start==5||start==7||start%2!=0&&start%3!=0&&start%5!=0 &&start%7!=0) {
				System.out.println(start+"is prime");
			}
			start++;
		}
	}

}
