package Lab1;

import java.util.Scanner;
import java.lang.Math;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double n2;
        double n3;
        double pi = Math.PI;
        System.out.println("Nhập vào bán kính R:");
        n = sc.nextInt();
        n2 = n*n*pi;
        n3 = 2*n*pi;
        System.out.println("Diện tích là: " + n2);
        System.out.println("Chu vi là : "+ n3);
    }
}
