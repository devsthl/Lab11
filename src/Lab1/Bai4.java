package Lab1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        System.out.println("Nhập điểm toán: ");
        int t = sc.nextInt();
        System.out.println("Nhập điểm lý: ");
        int l = sc.nextInt();
        System.out.println("Nhập điểm hóa: ");
        int h = sc.nextInt();
        int tbc = (t+l+h)/3;
        System.out.println("Điểm trung bình cộng 3 môn là: "+ tbc);
    }

}
