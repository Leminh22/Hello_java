package ngay0210;

import java.util.Scanner;

public class MainArray {
    public static void main(String[] agra){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++){
           System.out.println("Enter number" + (i + 1));
           numbers[i] = scanner.nextInt();
        } 
        for(int j = 0; j < size; j++){
            System.out.println("Enter Numbers : ");
            System.out.print(numbers[j]);
    }
    scanner.close();
}
}
