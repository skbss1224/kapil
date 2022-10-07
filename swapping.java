package kabil;

import java.util.Arrays;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		float first=1.20f,second=2.45f;
//		System.out.println("--before swap--");
//		System.out.println("first number="+first);
//		System.out.println("second number="+second);
//		
//		float temporary=first;
//		first=second;
//		second=temporary;
//		System.out.println("--after swap--");
//		System.out.println("first number="+first);
//		System.out.println("second number="+second);
		
		/*
		 * float first=12.0f,second=24.5f; System.out.println("--before swap--");
		 * System.out.println("first number="+first);
		 * System.out.println("second number="+second);
		 * 
		 * first=first-second; second=first+second; first=second-first;
		 * System.out.println("--after swap--");
		 * System.out.println("first number="+first);
		 * System.out.println("second number="+second);
		 */		
		
		
		int array[]= {10,20,25,63,96,57};
		int size=array.length;
		System.out.println(size);
		
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("sorted Array"+array);
		int res=array[size-1];
		System.out.println("second largest number"+res);
	}

}
