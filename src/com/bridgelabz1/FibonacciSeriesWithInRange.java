import java.util.Scanner;

public class FibonacciSeriesWithInRange {

    public static void main(String[] args) {


        int a = 0, b = 1, number, NextTerm;

        System.out.println("Please Enter which number you want to check");

        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();
        System.out.print(a + " , " + b);

        for (int i = 0; i <= number; i++) {
            NextTerm = a + b;
            a = b;
            b = NextTerm;
            System.out.print(" , " + NextTerm);

        }

    }

}


