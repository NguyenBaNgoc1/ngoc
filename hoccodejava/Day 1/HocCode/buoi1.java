package HocCode;

import java.util.Scanner;

public class buoi1 {

    // 1. khai bao 2 bien a va b kieu so nguyen, tinh tong
    public class Cau1 {
        public static void Bai1(String[] args) {
            int a = 1;
            int b = 2;

            System.out.println("a + b = " + (a + b));
        }
    }

    // 2. khai bao bien c,d kieu so thuc, tinh hieu
    public class cau2 {
        public static void bai2(String[] args) {
            double c = 1.2;
            double d = 2.3;

            System.out.println("c - d = " + (c - d));
        }
    }

    // 3. khai bao 2 bien e,f kieu so thuc, tinh 1/e + 1/f
    public class cau3 {
        public static void bai3(String[] args) {
            double e = 3.4;
            double f = 4.5;

            System.out.println("1/e + 1/f = " + (1 / e + 1 / f));
        }
    }

    // 4. khai bao 2 bien g,h kieu so nguyen, tinh g^2 + h^2
    public class cau4 {
        public static void bai4(String[] args) {
            int g = 4;
            int h = 5;

            System.out.println("g^2 + h^2 = " + (g ^ 2 + h ^ 2));
        }
    }

    // 5. khai bao bien i,j kieu so nguyen, (1/2*i + 1/2*j)
    public class cau5 {
        public static void bai5(String[] args) {
            int i = 5;
            int j = 6;

            System.out.println("(1/2*i + 1/2*j)" + (1 / 2 * i + 1 / 2 * j));
        }
    }

    // 6. khai bao 2 bien k,l kieu so nguyen, (k^2 + l^2)^(1/2)
    public class cau6 {
        public static void bai6(String[] args) {
            int k = 6;
            int l = 7;

            System.out.println("(k^2 + l^2)^(1/2)" + ((k ^ 2 + l ^ 2) ^ (1 / 2)));
        }
    }

    // 7.inra man inh chu vi dien tich hinh tron khi biet ban kinh

}