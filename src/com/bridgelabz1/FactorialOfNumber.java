import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int factorial = 1;

		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;

		}
		System.out.println(factorial);

	}

}
