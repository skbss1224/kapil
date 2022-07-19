package kabil;

public class unery_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unery operator
		// +  plus operator
		// -  minus operator
		//++ increment operator
		//-- degrement operator
		int a=5;
		System.out.println(a++);//post increment
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(++a);//pre increment
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		//degrement
		System.out.println(a--);//post degrement
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		
		System.out.println(--a);//pre degrement
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		
		//int a=10,b=5;
		System.out.println(a++ + ++a + a++ + ++a);
						//(10+12+12+14)
						//(22+26)
		System.out.println(a++ - b++ - ++a - ++b);
						//(10-5-12-7)
		System.out.println(a+++b++ + ++a + ++b);
						//(10+5+12+7)
						//(15+19)
						//(34)
		System.out.println(a++ + b++ -(++a - ++b));
						//(10+5-(12-7))
						//(15-(5))
	}

}
