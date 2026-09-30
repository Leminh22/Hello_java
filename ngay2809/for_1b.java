package ngay2809;

import java.util.Scanner;

public class for_1b {
  public static void main(String[] arga) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so thu nhat: ");
    int num1 = scanner.nextInt();
    System.out.println("Nhap so thu hai: ");
    int num2 = scanner.nextInt();
    int sum = 0;
    for (int i = num1 + 1; i < num2; i++) {
      if (i % 2 != 0) {
        sum = sum + i;
      }
      System.out.println("Tong cac so le" + sum);
    }
    scanner.close();
  }
}
