package HocCode;

import java.util.Scanner;

public class Buoi2Bai3 {

  public static void main(String[] args) {

    System.out.println("Nhap so nguyen a tu 1 den 7:");
    int a;
    try (Scanner scanner = new Scanner(System.in)) {
      a = scanner.nextInt();
      if (a < 1) {
        System.out.println("De nghi ban chay lai chuong trinh");
      } else if (a > 7) {
        System.out.println("De nghi ban chay lai chuong trinh");
      } else if (a == 1) {
        System.out.println("Thu 2");
      } else if (a == 2) {
        System.out.println("Thu 3");
      } else if (a == 3) {
        System.out.println("Thu 4");
      } else if (a == 4) {
        System.out.println("Thu 5");
      } else if (a == 5) {
        System.out.println("Thu 6");
      } else if (a == 6) {
        System.out.println("Thu 7");
      } else {
        System.out.println("Chu nhat");
      }
    }
  }
}