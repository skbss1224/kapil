package kabil;

class Book{

	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("this is book class");
	}

	public void hi() {
		// TODO Auto-generated method stub
		System.out.println("this is hi method");
	}
	
}
class basic{

	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("new hello class");
	}
	
}

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is method class");
		Book sasi=new Book();
		basic bye=new basic();
		sasi.hi();
		sasi.hello();
		bye.hello();
	}

}
