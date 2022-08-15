package kabil;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[]student_id= {4,5,6,7,8,93,5,6,7};
//		System.out.println(student_id[5]);
//		System.out.println(student_id[7]);
//		
//		int[]number=new int[5];
//		number[0]=10;
//		number[1]=20;
//		number[2]=30;
//		number[3]=40;
//		number[4]=50;
//		
//		System.out.println(number[3]);
//		System.out.println(number[4]);
//		
//		String[]student_id1= {"sivamani","aakash","vedha"};
//		System.out.println(student_id1[1]);
		
		
//		List<String> sasi=new ArrayList<String>();
//		sasi.add("");
//		System.out.println("empty array list"+sasi);
//		sasi.add("mango");
//		System.out.println("add one array list"+sasi);
//		sasi.add("cherry");
//		System.out.println("add two array list"+sasi);
//		sasi.add("strawberry");
//		System.out.println("add three array list"+sasi);
//		sasi.remove("cherry");
//		System.out.println("remove cherry"+sasi);
//		sasi.remove(0);
//		System.out.println("removed 0 th index"+sasi);
//		sasi.clear();
//		System.out.println("clear"+sasi);
		
		//apstraction list
		AbstractList list=new LinkedList();
		list.add("dog");
		list.add("cat");
		list.add("bird");
		list.add("tiger");
		list.add("rabit");
		System.out.println("*********************************");
		System.out.println("elements in the list1"+list);
		list.add(3,"deer");
		System.out.println("***************************");
		System.out.println("after adding deer at posisstion 3");
		System.out.println("elements in the list 1"+list);
	}

}
