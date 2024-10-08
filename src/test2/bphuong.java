package test2;

import java.util.Scanner;

public class bphuong {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap vao so can tinh: ");
        int so = nhap.nextInt();
        System.out.printf("%d", so*so);
    }

}
