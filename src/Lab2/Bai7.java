package Lab2;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 100; i <= 999; i++) {
            if ((i % 10 + (i / 10) % 10 + (i / 100) % 10) % 2 == 0) {
                System.out.println("Tổng chẵn là các chữ số: " + i);
            }
        }
    }
}
