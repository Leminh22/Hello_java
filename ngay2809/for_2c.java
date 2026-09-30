package ngay2809;

import java.util.Scanner;

public class for_2c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap mot so: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(number + " x " + i + " = " + (number * i));// a + x + b = a * b
        }
        scanner.close();
    }
}