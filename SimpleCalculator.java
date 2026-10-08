import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();
        System.out.print("Enter second number");
        int b = sc.nextInt();

        System.out.print("Addition = " + (a + b));
        System.out.print("Substraction = " + (a - b));
        System.out.print("Multiplication = " + (a * b));
        System.out.print("Division = " + (a / b));
        System.out.print("Remainder = " + (a % b));
    }
}
