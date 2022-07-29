package kabil;

import java.util.Scanner;

public class realnested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int fare=0,rows=0;String chart="";
		System.out.println("tell us no of rows in the bus:");
		rows=scan.nextInt();
		while(rows>0)
		{
			for(int seats=1;seats<=4;seats++)
			{
				System.out.println("enter the amount: ");
				fare=scan.nextInt();
				if(fare>=450)
				{
					System.out.println("ticket has booked @ "+seats+" of "+rows);
					chart+="$";
					
				}
				else
				{
					System.out.println("insuffiecient amount");
					chart+="@";
				}
				if(seats==2)
					chart+=" ";
			}
			chart+="\n";
			rows--;
		}
		System.out.println("chart of above booking process:\n"+chart);
		scan.close();
		System.out.println(chart);
	}

}
