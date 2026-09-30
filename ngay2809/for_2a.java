package ngay2809;

import java.util.Scanner;

public class for_2a {
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Vui long nhap ten: ");
    String name = scanner.nextLine();
    System.out.println("Vui long nhap tuoi: ");
    int age = scanner.nextInt();
    for(int i = 1; i < age; i++){
      System.out.print(name);
    }
    scanner.close();
   }
}
