package bt6;

import java.util.Scanner;


public class bt6 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào giá trị cần tính: ");
        int n = nhap.nextInt();
        double ketqua = Math.sqrt(n);
        System.out.printf("Kết quả: %f",ketqua);

    }
}
