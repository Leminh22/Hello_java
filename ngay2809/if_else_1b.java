package ngay2809;

import java.util.Scanner;

public class if_else_1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap mot ky tu: ");
        char kytu = scanner.next().charAt(0);// người dùng nhập ký tự bất kì
        switch (kytu) {
            case 'A':
            case 'a':
                System.out.println("ADA");
                break;
            case 'B':
            case 'b':
                System.out.println("Basic");
                break;
            case 'C':
            case 'c':
                System.out.println("Cobol");
                break;
            case 'D':
            case 'd':
                System.out.println("d Base III");
                break;
            case 'F':
            case 'f':
                System.out.println("Frotran");
                break;
            case 'P':
            case 'p':
                System.out.println("Pascal"); 
                break;
            case 'V':
            case 'v':
                System.out.println("Visual C++ ");
                break;                  
            default:
                System.out.println("Không hợp lệ");
                break;
        }
        scanner.close();

    }

}
