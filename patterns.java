package kabil;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int rows=5;
//		for(int i=1;i<=rows;++i) {
//			for(int j=1;j<=i;++j) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		//square star
//		int n=5;
//		for (int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//right upper triangle
//		int size=5;
//		for (int i=0;i<size;i++) {
//			for(int j=1;j<size-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=0;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//right down
//		int size =5;
//		for(int i=0;i<size;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=size;j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//pyramid star pattern
		int size=5;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
