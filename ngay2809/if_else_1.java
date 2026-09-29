package ngay2809;

import java.util.Scanner;

public class if_else_1 {
     public static void main(String[] agre){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Vui long nhap cap bac cua nhan vien: ");
     String grade = scanner.next();
     System.out.println("Vui long nhap luong co ban :");
     double salary = scanner.nextDouble();
     int allowance = 100;
     if(grade.equalsIgnoreCase("A")){
        allowance = 300;
     }else if(grade.equalsIgnoreCase("B")) {
        allowance = 250;
     }
     salary += allowance;
     System.out.println("Luong thuc nhan " + salary);
     scanner.close();
    }
}
