package kabil;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner runtime=new Scanner(System.in);
		System.out.println("enter the sasi value:");
		int sasi=runtime.nextInt();
		System.out.println("enter the kapil value:");
		int kapil=runtime.nextInt();
		int total;
		total=sasi+kapil;
		System.out.println("plus operator:"+total);
		total=sasi-kapil;
		System.out.println("minus operator:"+total);
		total=sasi*kapil;
		System.out.println("mul operator:"+total);
		total=sasi/kapil;
		System.out.println("div operator:"+total);
		total=sasi%kapil;
		System.out.println("per operator"+total);
	}

}
