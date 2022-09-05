import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		Scanner Input1 = new Scanner(System.in);
		System.out.println("Please enter the first Number");

		int Number1 = Input1.nextInt();

		Scanner Input2 = new Scanner(System.in);
		System.out.println("Please enter the Second Number");

		Scanner Input3 = new Scanner(System.in);
		int Number2 = Input2.nextInt();

		System.out.println("Please enter the Third Number");

		int Number3 = Input3.nextInt();

		if (Number1 == Number2) {
			System.out.println("First Two Numbers are equal");

		} else if (Number2 == Number3) {
			System.out.println("Last Two Numbers are equal");
		} else if (Number1 == Number3) {
			System.out.println("First and Third Number are equal");

		}
		System.out.println("and " + Math.max(Number3, Math.max(Number2, Number1)) + " is the Greatest");

	}

}
