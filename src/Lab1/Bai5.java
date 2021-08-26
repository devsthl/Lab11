package Lab1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ 1: ");
        double n1 = sc.nextInt();
        System.out.println("Nhập số nguyên thứ 2: ");
        double n2 = sc.nextInt();
        double c = n1+n2;
        double t = n1-n2;
        double n = n1*n2;
        double ch  = n1/n2;
        System.out.println("Phép cộng n1 + n2 = "+ c);
        System.out.println("Phép trừ n1 - n2 = "+ t);
        System.out.println("Phép nhân n1 x n2 = "+ n);
        System.out.println("Phép chia n1/n2 = " + ch);
    }
}
