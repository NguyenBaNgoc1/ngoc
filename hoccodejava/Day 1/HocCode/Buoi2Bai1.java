package HocCode;

import java.util.Scanner;

public class Buoi2Bai1 {
    public static void main(String[] args) {

        System.out.println("nhap so nguyen a:");
        int a;
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextInt();

            System.out.println("nhap so nguyen b:");
            int b;
            b = scanner.nextInt();

            System.out.println("nhap so nguyen c:");
            int c;
            c = scanner.nextInt();

            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.println("la canh cua cung 1 tam giac");
            } else {
                System.out.println("khong phai la canh cua cung 1 tam giac");
            }
        }
    }

}