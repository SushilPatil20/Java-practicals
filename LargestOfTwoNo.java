import java.util.Scanner;

class LargestOfTwoNo {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter Second number:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " Is larger ");
        } else {
            System.out.println(num2 + " Is larger ");
        }

    }
}