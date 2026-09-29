package sli28;

public class DisplaySum {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;

        // Sử dụng print() liên tục để nối các đoạn text và số lại trên cùng một dòng
        System.out.print("The sum of ");
        System.out.print(num1);
        System.out.print(" and ");
        System.out.print(num2);
        System.out.print(" is ");
        System.out.print(sum);
        System.out.println("."); // In dấu chấm cuối cùng và xuống dòng

        int num3 = 2;
        sum = num1 + num2 + num3;
        
        // Sử dụng toán tử cộng (+) để nối chuỗi ngắn gọn hơn kết hợp với println()
        System.out.println("The sum of " + num1 + ", " + 
            num2 + " and " + num3 + " is " + sum + ".");

    }
}
