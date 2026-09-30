package ngay2809;

import java.util.Scanner;

public class if_else_2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoc sinh nhap diem de xep loai:");
        double marks = scanner.nextDouble();
        if (marks > 75) {
            System.out.println("Hoc sinh xep loai A");
        } 
        else if (marks > 60 && marks <= 75) {
            System.out.println("Hoc sinh xep loai B");
        } 
        else if (marks > 45 && marks <= 60) {
            System.out.println("Hoc sinh xep loai C");
        } 
        else if (marks > 35 && marks <= 45) {
            System.out.println("Hoc sinh xep loai D");
        } 
        else {
            System.out.println("Hoc sinh xep loai E");
        }
        scanner.close();
    }

}
