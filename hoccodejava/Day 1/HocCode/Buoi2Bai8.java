package HocCode;

import java.lang.Math;
import java.util.Scanner;

//Số chính phương là số bằng bình phương đúng của một số nguyên.
//Hay hiểu đơn giản, số chính phương là một số tự nhiên có căn bậc hai cũng là một số tự nhiên.
public class Buoi2Bai8 {
    public static void main(String[] args) {
        System.out.println("Nhap gia tri nguyen cho a:");
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        double sqrtA = Math.sqrt(a);

        if ((sqrtA * sqrtA) == a) {
            System.out.println("a la so chinh phuong");
        } else {
            System.out.println("a khong phai la so chinh phuong");
        }
    }
}
