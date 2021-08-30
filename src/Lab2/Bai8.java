package Lab2;

import java.util.List;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Chọn các chương trình sau: ");
            System.out.println("1. Enter a number n");
            System.out.println("2. Convert to binary number");
            System.out.println("3. Convert to octal");
            System.out.println("4. Convert to hexa number");
            System.out.println("5. Exit");
            int choice =  Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter a number n: ");
                    int n = Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Enter a number n: ");
                    int n1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Convert to binary number: "+ Integer.toBinaryString(n1));
                    break;
                case 3:
                    System.out.println("Enter a number n: ");
                    int n2 = Integer.parseInt(sc.nextLine());
                    System.out.println("Convert to octal number: "+ Integer.toOctalString(n2));
                    break;
                case 4:
                    System.out.println("Enter a number n: ");
                    int n3 = Integer.parseInt(sc.nextLine());
                    System.out.println("Convert to hexa number: "+ Integer.toBinaryString(n3));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
            }
        } while (true);
    }
}
