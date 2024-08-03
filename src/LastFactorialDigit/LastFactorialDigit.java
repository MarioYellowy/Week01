package LastFactorialDigit;

import java.util.Scanner;

public class LastFactorialDigit {
    public static void getFactorial() {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        int[] factList = new int[numCases];

        if (numCases > 1 && numCases < 10) {
            for (int i = 0; i < numCases; i++) {
                int factorial = sc.nextInt();
                int result = 1;
                for (int j = 1; j <= factorial; j++) {
                    result = result * j;
                }
                factList[i] = result % 10;
            }
        } else {
            System.out.println("Please insert a number between 1 and 10");
        }

        for (int j : factList) {
            System.out.println(j);
        }
    }
}
