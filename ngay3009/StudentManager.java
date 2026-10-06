package ngay3009;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> listStudent = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Student findById(int rollNumber) {
        for (Student s : listStudent) {
            if (s.getRollNumber() == rollNumber) {
                return s;
            }
        }
        return null;
    }

    public void displayStudent() {
        System.out.println("Display student list!");
        System.out.printf("------------------------------------------------\n");
        if (listStudent.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        for (Student St1 : listStudent) {
            System.out.println(St1);
        }
    }

    public void addStudent() {
        System.out.println("Add student information!");
        System.out.printf("------------------------------------------------\n");
        System.out.println("Hay nhap ma sinh vien : ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hay nhap ho va ten : ");
        String name = scanner.nextLine();
        System.out.println("Hay nhap tuoi : ");
        int age = scanner.nextInt();
        System.out.println("Hay nhap diem : ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        listStudent.add(new Student(rollNumber, name, age, gpa));
        System.out.println("Them sinh vien thanh cong");
    }

    public void updateStudent() {
        System.out.println("Update student information");
        System.out.printf("------------------------------------------------\n");
        System.out.println("Nhap ma sinh vien can update");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        Student St1 = findById(rollNumber);
        if (St1 == null) {
            System.out.println("Ma sinh vien khong ton tai");
            return;
        }
        System.out.println("Nhap ho va ten sinh vien : ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi sinh vien : ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        St1.setName(name);
        St1.setAge(age);
        St1.setGpa(gpa);
        System.out.println("Thêm thành công!");
    }

    public void deleteStudent() {
        System.out.println("Delete student");
        System.out.printf("------------------------------------------------\n");
        System.out.println("Nhap ma sinh vien can xoa : ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        Student St1 = findById(rollNumber);
        if (St1 == null) {
            System.out.println("Ma sinh vien khong ton tai");
            return;
        }
        listStudent.remove(St1);
        System.out.println("Xoa thanh cong!");
    }

    public void searchStudent() {
        System.out.println("Search student");
        System.out.printf("------------------------------------------------\n");
        System.out.println("Nhap ten can tim : ");
        String keyword = scanner.nextLine().trim().toLowerCase();
        boolean found = false;
        for (Student s : listStudent) {
            if (s.getName().toLowerCase().contains(keyword)) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co ket qua!");
        }
    }

}
