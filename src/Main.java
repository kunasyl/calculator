import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstVal, secondVal;
        Scanner scan = new Scanner(System.in);
        firstVal = scan.nextDouble();
        secondVal = scan.nextDouble();
        System.out.println(divide(firstVal,secondVal));
        System.out.println(substract(firstVal,secondVal));
        System.out.println(factorial(secondVal));
    }

    public static double substract(double firstVal, double secondVal) {
        return firstVal-secondVal;
    }

    public static double divide(double firstVal, double secondVal) {
        return firstVal/secondVal;
    }

    public static double factorial(double num) {
        double res = 1;
        for (int i=1; i<=num; i++) {
            res *= i;
        }
        return res;
    }
}
