package kabil;
import java.util.Arrays;

public class static_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabet.hify(2);
		Alphabet.numeric.update(6000);
		Alphabet.numeric num=new Alphabet.numeric();
		num.taverse();
	}

}
class Alphabet
{
	private static Integer[][] apart= {{8700,1300},{9100,10900,3400,5100},{2100,4000,3100}};
	public static void hify(int row)
	{
		if(row<apart.length)
		{
			System.out.println(Arrays.toString(apart[row]));
		}
		else {
			System.out.println("invalid row"+row);
		}
	}
	static class numeric{
		public void taverse() {
			for(Integer[] row:apart)
			{
				System.out.println(Arrays.toString(row));
			}
		}
		public static void update(int max)
		{
			for(int row=0;row<apart.length;row++)
			{
				for(int col=0;col<apart[row].length;col++)
				{
					if(apart[row][col]>=max)
						apart[row][col]-=(int)(apart[row][col]*0.500);
				}
			}
		}
	}
}
