package Lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên thứ 1: ");
        int n1 = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ 2: ");
        int n2 = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ 3: ");
        int n3 = sc.nextInt();
        System.out.println("Nhập vào số nguyên thứ 4: ");
        int n4 = sc.nextInt();
        int max;
        int max1;
        int max2;
        if (n1>n2) {
            max1 = n1;
        }else {
            max1 = n2;
        }
        if (n3>n4){
            max2 = n3;
        }else {
            max2 = n4;
        }
        if(max1>max2){
            max = max1;
        } else {
            max = max2;
        }
        System.out.println("Giá trị lớn nhất là: "+max);
    }
}
