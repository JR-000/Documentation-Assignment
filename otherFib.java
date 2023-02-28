import java.util.*;
import java.util.Scanner;

public class otherFib {
	static void inter(int n) {
		int number1 = 0, number2 = 1, counter = 0;
		
		while (counter < n) {
			System.out.println(number1 + " ");
			
			int number3 = number2 + number1;
			number1 = number2;
			number2 = number3;
			counter = counter +1;
		}
	}

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		long start = System.nanoTime();

		int n = c.nextInt();
		inter(n);

		long end = System.nanoTime();
		System.out.println(start);
		System.out.println(end);
		double actualTime = (double)(end - start)/10000000;
		System.out.println("Total time is: " +actualTime+ "s");
	}
}
