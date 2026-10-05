package ngay0510;

public class Student {
    private String fullName;
    private String rollNumber;
    private int email;
    private String phone;
    private String dob;
    private double balance;// số dư trong ví tiền

    // getter : để trả thông tin của 1 trường ra ngoài
    public String getRollNumber() {
        return this.rollNumber;
    }// quyết định dữ liệu đầu ra bên ngoài
     // setter : đưa giá trị bên ngoài vào gán vào trường

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }// quyết định dữ liệu đầu vào chỉ trong trường hợp (validate : dữ liệu đạt đủ
     // điều kiện ) mới ra bên ngoài
     // Tất cả dữ liệu được kiểm soát khi qua getter và setter

    public void intro() {
        System.out.println("name" + this.fullName);
        System.out.println("balance" + this.balance);
        System.out.println("emali" + this.email);
    }
    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBlance() {
        return this.balance * 100;
    }

    public void setBlance(double balance){
        if(balance > 0){
        this.balance = balance;
    }
    }
    public int getEmail(){
        return this.email;
    }
    public void setEmail(int email){
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getDob(){
        return this.dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
}
