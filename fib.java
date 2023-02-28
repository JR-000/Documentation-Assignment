import java.io.*;
import java.util.Scanner;

public class fib {
	public static int recur(int number) {
		if (number <= 1)
			return number;
		
		else 
			return recur(number - 1) + recur(number - 2);
	}

	public static void main(String[] args) {
		Scanner count = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n = count.nextInt();
		long start = System.nanoTime();

		for (int i = 0; i < n; i++) {
			
			System.out.println(+recur(i));
			
		}
		long end = System.nanoTime();
		System.out.println(start);
		System.out.println(end);
		double actualTime = (double)(end - start)/10000000;
		System.out.println("Total time is: " +actualTime+ "s");
	}
		
}
