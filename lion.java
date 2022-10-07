package kabil;

class cheeta{
	public void speed() {
		System.out.println("cheeta speed is 80");
	}
}
class elephant extends cheeta{
	public void hlo() {
		System.out.println("elephant speed is 10");
	}
}

public class lion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is object");
		elephant ele=new elephant();
		ele.speed();
		ele.hlo();
	}

}
