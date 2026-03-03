package PA_303_5_1;

import java.util.Scanner;

public class PA30351_Loops {

    public static void main(String[] args) {

        // Task 1
        printMultiplicationTable();

        // Task 2
        findGCD();

        // Task 3
        predictTuition();
    }

    // ------------------------------------------------------------
    // 1) Multiplication Table (Nested For Loops)
    // ------------------------------------------------------------
    public static void printMultiplicationTable() {
        System.out.println("----- Task 1: Multiplication Table -----");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    // ------------------------------------------------------------
    // 2) Greatest Common Divisor (Using Loop as instructed)
    // ------------------------------------------------------------
    public static void findGCD() {
        System.out.println("\n----- Task 2: Greatest Common Divisor -----");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first positive integer: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second positive integer: ");
        int n2 = sc.nextInt();

        int gcd = 1;

        int limit = Math.min(n1, n2);

        for (int k = 2; k <= limit; k++) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        System.out.println("The GCD is: " + gcd);
    }

    // ------------------------------------------------------------
    // 3) Predict Future Tuition
    // ------------------------------------------------------------
    public static void predictTuition() {
        System.out.println("\n----- Task 3: Predict Future Tuition -----");

        double tuition = 10000;
        int years = 0;

        while (tuition < 20000) {
            tuition = tuition * 1.07;
            years++;
        }

        System.out.println("Tuition will double in " + years + " years.");
        System.out.printf("Final tuition amount: $%.2f%n", tuition);
    }
}