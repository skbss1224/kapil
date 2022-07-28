package kabil;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=0;
//		while(a<=10) {
//			System.out.println(a);
//			a=a+1;
//		}
		
//		for(;;) {
//			System.out.println("hello");
//		}
		
//		for(int a=1;a<=2;a++) {
//			System.out.println("blue jeans");
//			System.out.println("black jeans");
//		}
		
		
		
		
		int stock=0,required=0,pay=0,payable=0,invoices=0;float time=0.0f;
		Scanner scan=new Scanner(System.in);
		for(stock=75,time=12.01f;stock>0&&time<=12.59f;time+=0.01f)
		{
			System.out.println("tell us how many mobile you wish: ");
			required=scan.nextInt();
			if(required<=stock)
			{
				payable=required*14999;
				System.out.println("enter the amount:");
				pay=scan.nextInt();
				if(pay>=payable)
				{
					System.out.println("order places for "+required+" i phone 13pro");
					stock-=required;
					invoices++;
				}
				else {
					System.out.println("order couldn't placed due to insufficient amount ");
				}
			}
			else {
				System.out.println("we have only "+stock+" i phones available");
			}
		}
		System.out.println("total invoices are: "+invoices+" still in stock "+stock);
		scan.close();
		
	}

}
