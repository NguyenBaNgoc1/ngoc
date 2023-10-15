package HocCode;

import java.util.Scanner;

public class Buoi2Bai4 {
    public static void main(String[] args) {

        System.out.println("Nhay so nam a:");
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if ((a % 4) == 0 && ((a % 100) != 0)) {
            System.out.println("Nam " + a + " la nam nhuan");
        } else {
            System.out.println("Nam " + a + " khong phai la nam nhuan");
        }
    }
}