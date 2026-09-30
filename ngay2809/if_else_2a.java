package ngay2809;

import java.util.Scanner;

public class if_else_2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap mot so a = ");
        int a = scanner.nextInt();
        System.out.println("Hay nhap mot so b = ");
        int b = scanner.nextInt();
        int difference = a - b;
        System.out.println("Hieu cua a va b la: " + difference);
        if (difference == a) {
            System.out.println("Hieu bang so da nhap: " + a );
        } 
        else if (difference == b) {
            System.out.println("Hieu bang so da nhap: " + b);
        }
        else if (difference != a) {
            System.out.println("Hieu khong bang so da nhap");
        } 
        else if (difference != b) {
            System.out.println("Hieu khong bang so da nhap");
        }
        scanner.close();
    }
}


