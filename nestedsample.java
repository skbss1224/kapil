package kabil;

public class nestedsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int hai=1;hai<=10;hai++)
		{
			System.out.println("table of "+hai);
			for(int yet=1;yet<=10;yet++)
			{
				System.out.println(yet+" X "+hai+" = "+(hai*yet));
			}
		}
	}

}
