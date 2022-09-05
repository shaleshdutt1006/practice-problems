import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.println("Please Enter Year which You Want to Test");
		int Year = Input.nextInt();
		if (Year % 400 == 0) {
			System.out.println("This is a Leap Year");
		} else if (Year % 4 == 0 && Year % 100 != 0) {
			System.out.println("This is a Leap Year");
		}

		else {
			System.out.println("This is not a Leap Year");
		}

		SecondMethod obj = new SecondMethod();
		obj.Second();

	}
}

class SecondMethod {

	public void Second() {

		Scanner Input1 = new Scanner(System.in);
		System.out.println("Please Enter Year which You Want to Test");
		int Year1 = Input1.nextInt();
		int flag = (Year1 % 400 == 0) || (Year1 % 4 == 0 && Year1 % 100 != 0) ? 1 : 0;
		if (flag == 1) {
			System.out.println("This is a Leap Year");
		} else {
			System.out.println("This is not  a Leap Year");
		}
	}
}
