package ngay3009;

public class Student {
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
    }// để in ra thông tin

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
