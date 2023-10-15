package HocCode;

import java.util.Scanner;

public class Buoi2Bai5 {
    public static void main(String[] args) {

        System.out.println("Nhay so nguyen a:");
        double a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        System.out.println("Nhap so nguyen b:");
        double b;
        b = scanner.nextInt();

        double x = (-b / a);

        if (a == 0 && b == 0) {
            System.out.println("Vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Vo nghiem");
        } else {
            System.out.println("Phuong trinh co nghiem la: x = -b/a");
            System.out.println("=> x =" + x);
        }
    }
}