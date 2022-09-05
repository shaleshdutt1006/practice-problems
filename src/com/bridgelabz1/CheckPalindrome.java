import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		int reverse = 0, temp, remainder, number;

		System.out.println("Please Enter which number you want to check");

		Scanner myObj = new Scanner(System.in);

		number = myObj.nextInt();
		temp = number;

		while (temp != 0) {

			remainder = temp % 10; // example of Palindrome number 1234321
			reverse = reverse * 10 + remainder;
			temp = temp / 10;

		}

		if (number == reverse) {

			System.out.print("This is a Palindrome Number");
		} else {
			System.out.print("This is not a Palindrome Number");
		}

	}

}
