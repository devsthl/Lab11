package Lab2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //Vòng lặp for
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần tính giai thừa");
        int n = sc.nextInt();
        long k = 1;
        int i = 0;
        for (i = 1; i <= n; i++) {
            k = k * i;
        }
        System.out.println("Giai thừa vòng for của: " + n + " là " + k);
        //Vòng lặp while
        long k1=1;
        int j =1;
        while ( j <= n){
            k1 = k1 * j;
            j++;
        }
        System.out.println("Giai thừa vòng while của: " + n + " là " + k1);
    }
}
