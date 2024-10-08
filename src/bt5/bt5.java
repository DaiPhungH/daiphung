package bt5;

import java.util.Scanner;


public class bt5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào giá trị x: ");
        double x = nhap.nextDouble(); // Sử dụng double để cho phép giá trị thực

        // Tính giá trị của biểu thức
        double result = 3 * Math.pow(x, 3) - 5 * Math.pow(x, 2) + 6;

        // In ra kết quả
        System.out.printf("Giá trị của biểu thức 3x^3 - 5x^2 + 6 là: %.2f%n", result);


    }
}

