package methodSumsAndMore;

import java.util.Arrays;

public class methodsSumsAndMore {

	public static void main(String[] args) {
		int storst;
		int minst;
		storst = methodClass.greatest(19, 14, 8);
		minst = methodClass.smallest(19, 14, 8);
		System.out.println(storst);
		System.out.println(minst);
		
		System.out.println("Greatest: " + methodClass.greatest(25, 444, 12));
		System.out.println("Smallest: " + methodClass.smallest(25, 444, 12));
		System.out.println("Sum: " + methodClass.sum(25, 444, 12));
		

	}
	
//	public static int greatest(int number1, int number2, int number3) {
//		
//		int a[]= {number1, number2, number3};
//		Arrays.sort(a);
//		return a[2];
//	}
//	
//public static int smallest(int number1, int number2, int number3) {
//		
//		int a[]= {number1, number2, number3};
//		Arrays.sort(a);
//		return a[0];
//	}
//	
//	public static int sum(int number1, int number2, int number3) {
//		
//		int sum = number1 + number2 + number3;
//		return sum;
//	}

}
