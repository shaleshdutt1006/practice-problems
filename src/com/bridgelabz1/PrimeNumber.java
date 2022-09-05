import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 1;

		Scanner Input = new Scanner(System.in);
		System.out.println("Please enter the number you want to check is prime or not");
		int Output = Input.nextInt();

		if (Output < 2) {
			System.out.println("It is not a Prime Number");

		} else if (Output >= 2) {
			for (int i = 2; i < Output; i++) {
				if (Output % i == 0) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println("It is not a Prime Number");
			}

			else {
				System.out.println("It is  Prime Number");
			}
		}
	}
}