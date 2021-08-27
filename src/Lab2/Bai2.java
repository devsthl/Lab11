package Lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm: ");
        int year = sc.nextInt();
    do{
        System.out.println("Nhập vào tháng cần tìm: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                System.out.println("Tháng " +choice+ " có 30 ngày");
                System.exit(0);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
            case 12:
                System.out.println("Tháng " +choice+ " có 31 ngày");
                System.exit(0);
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("Tháng 2 năm "+year+" là năm nhuận có 29 ngày");
                } else {
                    System.out.println("Tháng 2 năm "+ year+" có 28 ngày");
                }
                System.exit(0);
                break;
            default:
                System.out.println("Nhập tháng từ 1-12");
            }
        }while(true);
    }
}
