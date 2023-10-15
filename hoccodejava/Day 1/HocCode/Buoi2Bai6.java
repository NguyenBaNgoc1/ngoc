package HocCode;

import java.util.Scanner;

//(*) Nhập vào 1 số nguyên bất kỳ, in ra màn hình giá trị hàng trăm của số đó (nếu có)
public class Buoi2Bai6 {
    public static void main(String[] args) {

        System.out.println("Nhap so nguyen a:");
        int a;
        Scanner scanner = new Scanner(System.in);
        {
            a = scanner.nextInt();
        }
        int x = a / 100;

        if (x < 10) {
            System.out.println("So hang tram la " + x);
        } else {
            System.out.println("So hang tram la " + (x % 10));
        }

    }
}
