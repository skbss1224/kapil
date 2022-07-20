package kabil;

import java.util.Scanner;

public class control_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks:");
		int tamil,english,maths,science,social;
		System.out.println("enter your tamil mark:");
		tamil=sc.nextInt();
		System.out.println("enter your english mark:");
		english=sc.nextInt();
		System.out.println("enter your maths mark:");
		maths=sc.nextInt();
		System.out.println("enter your science mark:");
		science=sc.nextInt();
		System.out.println("enter your social mark:");
		social=sc.nextInt();
		if(tamil<english) {
			System.out.println("english mark is big");
		}
		else if(english<maths) {
			System.out.println("maths mark is big");
		}
		else if(maths <science) {
			System.out.println("science mark is big");
		}
		else if(science<social) {
			System.out.println("social mark is big");
		}
		else {
			System.out.println("none of these");
		}
	}

}
