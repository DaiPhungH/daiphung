package test;

import java.util.Scanner;

public class alo {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = nhap.nextInt();


        System.out.print("Nhập tháng: ");
        int month = nhap.nextInt();


        System.out.print("Nhập năm: ");
        int year = nhap.nextInt();

        System.out.printf("Ngày tháng năm: %02d/%02d/%02d%n", day, month, year);

        nhap.close();
    }
}
