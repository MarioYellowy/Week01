package QuadrantSelection;

import java.util.Scanner;

public class QuadrantSelection {

    public static void getQuadrant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("X:");
        int x = sc.nextInt();
        System.out.println("Y:");
        int y = sc.nextInt();

        if (-1000 < x && x < 1000 && x != 0 && -1000 < y && y < 1000 && y != 0) {
            if (x < 0 && y > 0) {
                new showResult(1);
            } else if (x > 0 && y > 0) {
                new showResult(2);
            } else if (x < 0 && y < 0) {
                new showResult(3);
            } else if (x > 0 && y < 0) {
                new showResult(4);
            }
        } else {
            System.out.println("?");
        }
    }
}
