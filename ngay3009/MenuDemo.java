package ngay3009;

import java.util.Scanner;

public class MenuDemo {
  static class Student {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      StudentManager SM1 = new StudentManager();
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
        int choice = scanner.nextInt();// 1 enter
        scanner.nextLine();
        switch (choice) {
          case 1:
            System.out.println("Display student list!");
            SM1.displayStudent();
            break;
          case 2:
            System.out.println("Add student information!");
            SM1.addStudent();
            break;
          case 3:
            System.out.println("Update student information");
            SM1.updateStudent();
            break;
          case 4:
            System.out.println("Delete student");
            SM1.deleteStudent();
            break;
          case 5:
            System.out.println("Search student");
            SM1.searchStudent();
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
        
      }
    }
  }
}
