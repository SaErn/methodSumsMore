package methodSumsAndMore;

import java.util.Arrays;

public class methodClass {

public static int greatest(int number1, int number2, int number3) {
		
		int a[]= {number1, number2, number3};
		Arrays.sort(a);
		return a[2];
	}
	
public static int smallest(int number1, int number2, int number3) {
		
		int a[]= {number1, number2, number3};
		Arrays.sort(a);
		return a[0];
	}
	
	public static int sum(int number1, int number2, int number3) {
		
		int sum = number1 + number2 + number3;
		return sum;
	}
}
