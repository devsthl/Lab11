package Lab2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println("");
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j >= i; j--)
                System.out.print("$ ");
            System.out.println("");
        }
        for (int k = 1; k <= 6; k++) {
            for (int h = 1; h <= 6 - k; h++) {
                System.out.print("  ");
            }
            for (int g = 1; g <= 2 * k -1; g++)
                System.out.print("* ");
                System.out.println(" ");
        }

    }
}
