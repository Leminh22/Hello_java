package sli23;

public class UnicodeSequence {
    public static void main(String[] args) {
       // In chữ 'Hello' sử dụng các ký tự chuỗi thoát thập phân Unicode
        System.out.println("\u0048\u0065\u006C\u006C\u006F" + "!\n"); // In ra "Hello"
       // In ra chữ 'Blake' sử dụng chuỗi thoát thập phân cho chữ 'a'
       System.out.println("Bl\141ke\"2007\" "); 
    }

}
