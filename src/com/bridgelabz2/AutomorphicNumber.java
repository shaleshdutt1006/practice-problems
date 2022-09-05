import java.util.Scanner;

public class AutomorphicNumber {

    public static boolean isAutomorphic(int number) {

        int square = number * number;

        while (number != 0) {

            if (number % 10 != square % 10) {
                return false;
            }

            number = number / 10;
            square = square / 10;
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check");

        int number = sc.nextInt();

        if (isAutomorphic(number)) {
            System.out.println("this number is Automorphic Number");
        } else {
            System.out.println("This is not a Automorphic Number");
        }

    }

}

