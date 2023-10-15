package HocCode;

import java.util.Scanner;
//7. (*) Nhập vào 3 sô nguyên a, b, c. Tìm giá trị lớn nhất của 3 số đó
public class Buoi2Bai7 {
    public static void main(String[] args) {

        System.out.println("Nhap so nguyen a:");
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Nhap so nguyen b:");
        int b;
        b = scanner.nextInt();
        System.out.println("Nhap so nguyen c:");
        int c;
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("a la so lon nhat");
        } else if (b > a && b > c) {
            System.out.println("b la so lon nhat");
        } else {
            System.out.println("c la so lon nhat");
        }

    }
}
