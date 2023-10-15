package HocCode;

import java.util.Scanner;

public class Buoi2Bai2 {
    public static void main(String[] args) {

        System.out.println("Nhap so nguyen a:");
        int a;
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextInt();

            System.out.println("Nhap so nguyen b:");
            int b;
            b = scanner.nextInt();

            System.out.println("Nhap so nguyen c:");
            int c;
            c = scanner.nextInt();

            if (((a * a) + (b * b) == (c * c)) || ((a * a) + (c * c) == (b * b)) || ((c * c) + (b * b) == (a * a))) {
                System.out.println("a,b,c la canh cua cung 1 tam giac vuong");
            } else {
                System.out.println("a,b,c khong phai la canh cua cung 1 tam giac vuong");
            }
        }
    }
}
