package sli33;

import java.util.Scanner;


public class FormattedInput {

    public static void main(String[] args) {
        // Tạo một đối tượng Scanner và truyền vào luồng đầu vào chuẩn (bàn phím)
        Scanner s = new Scanner(System.in);// contrucltor Scanner nhận vào luồng đầu vào chuẩn (bàn phím)
        System.out.println("Enter a number:");
        // Nhận giá trị số nguyên từ người dùng
        int intValue = s.nextInt();
        System.out.println("Enter a decimal number:");
        // Nhận giá trị số thực từ người dùng (chú thích trong slide gốc nhầm thành integer)
        float floatValue = s.nextFloat();
        System.out.println("Enter a String value");
        // Nhận giá trị chuỗi (String) từ người dùng
        String strValue = s.next();
        System.out.println("Values entered are: ");
        System.out.println(intValue + " " + floatValue + " " + strValue);
        s.close();
    }

}
//sc.next(); là một chuỗi từ bàn phím
//sc.nextLine(); là một chuỗi từ bàn phím, bao gồm cả khoảng trắng
//sc.nextInt(); là một số nguyên từ bàn phím
//sc.nextFloat(); là một số thực từ bàn phím


//nextByte()	Trả về token tiếp theo dưới dạng giá trị kiểu byte
//nextInt()	    Trả về token tiếp theo dưới dạng giá trị kiểu int
//nextLong()	Trả về token tiếp theo dưới dạng giá trị kiểu long
//nextFloat()	Trả về token tiếp theo dưới dạng giá trị kiểu float
//nextDouble()	Trả về token tiếp theo dưới dạng giá trị kiểu double


//println ()	In ra màn hình và xuống dòng
//print ()	In ra màn hình nhưng không xuống dòng
