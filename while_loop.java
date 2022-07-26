package kabil;

import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=0;
//		while(a<=100) {
//			System.out.println(a);
//			a=a+1;
//		}
//		int a=1;
//		while(a<=100) {
//			System.out.println("hello im sasi");
//			a=a+1;
//		}
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a value");
		int a=scan.nextInt();
		while(a<=100) {
			System.out.println(a);
			a=a+2;
		}
	}

}
