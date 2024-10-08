package test2;

import java.util.Scanner;

public class bphuong {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số cần tính: ");
        int so = nhap.nextInt();
        System.out.printf("Kết quả là: %d", so*so);
    }

}
