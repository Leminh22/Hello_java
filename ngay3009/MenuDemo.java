package ngay3009;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MenuDemo {
  static class Student {
    int rollNumber;
    String name;
    int age;
    double gpa;

    Student(int rollNumber, String name, int age, double gpa) {
      this.rollNumber = rollNumber;
      this.name = name;
      this.age = age;
      this.gpa = gpa;
    }

    @Override
    public String toString() {
      return "MaSV : " + rollNumber + "  HovaTen : " + name + "  Tuoi : " + age + "  Diem : " + gpa;
    }
  }
  public static void main(String[] args) {
    List<Student> listStudent = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    // danh sach hoc sinh
    listStudent.add(new Student(1, "Nguyen Van A", 18, 3.5));
    listStudent.add(new Student(2, "Tran Van B", 20, 3.2));
    while (true) {
      System.out.println("Student management");
      System.out.println("---------------------------");
      System.out.println("1.Show student list.");
      System.out.println("2.Add new student.");
      System.out.println("3.Update student information.");
      System.out.println("4.Delete student by rollnumber");
      System.out.println("5.Search student by keyword");
      System.out.println("0.Exit program");
      System.out.println("---------------------------");
      System.out.println("");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1:
          System.out.println("Display student list!");
          for (Student s : listStudent) {
            System.out.println(s);
          }
          break;
        case 2:
          System.out.println("Add student information!");
          System.out.print("Hay nhap ma sinh vien : ");
          int rollNumber = scanner.nextInt();
          scanner.nextLine();
          System.out.print("Hay nhap ho va ten : ");
          String name = scanner.nextLine();
          System.out.print("Hay nhap tuoi : ");
          int age = scanner.nextInt();
          System.out.print("Hay nhap diem : ");
          double gpa = scanner.nextDouble();
          listStudent.add(new Student(rollNumber, name, age, gpa));
          break;
        case 3:
          System.out.println("Update student information");
          System.out.print("Nhap ma sinh vien can cap nhat : ");
          int searchRollNumber = scanner.nextInt();
          scanner.nextLine();
          boolean isFound = false;
          for(Student s : listStudent)
            if(s.rollNumber == searchRollNumber){
              isFound = true;
              System.out.println("Tim thay sinh vien " + s.name);
              System.out.println("Tim thay sinh vien " );
              System.out.println("-----Hay cap nhat thong tin sinh vien-----");
              //Cap nhat thong tin
              System.out.println("Cap nhat ho va ten sinh vien : ");
              s.name = scanner.nextLine();
              System.out.println("Cap nhat tuoi sinh vien : ");
              s.age = scanner.nextInt();
              System.out.println("Cap nhat diem sinh vien : ");
              s.gpa = scanner.nextDouble();
              System.out.println("Cap nhat sinh vien thanh cong");
              break;//thoat phan tim kiem khi cap nhat thanh cong
            }
            if(!isFound){
             System.out.println("Khong tim thay sinh vien qua ma sinh vien" + searchRollNumber);
            }
          break;
        case 4:
          System.out.println("Delete student");
          break;
        case 5:
          System.out.println("Search student");
          break;
        case 0:
          System.out.println("See you later!");
          break;
        default:
          System.out.println("Invalid choice. Please enter number from 0 to 5.");
          break;
      }
      System.out.println("Press c to continue!");
      scanner.nextLine();
      scanner.close();
    }
  }
}
