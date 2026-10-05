package ngay0210;

public class MainFunction {
   public static int congHaiSo(int soThuNhat, int soThuHai){
      int tong = soThuNhat + soThuHai;
      return tong;
   }
   public static void main(String[] arga){
    HinhChuNhat hcn1 = new HinhChuNhat(20, 10);
    HinhVuong hv1 = new HinhVuong(5);
    HinhThoi ht = new HinhThoi(4, 2, 2);
    System.out.println("Chu vi hinh chu nhat" + hcn1.tinhChuVi());
    System.out.println("Dien tich hinh chu nhat" + hcn1.tinhDienTich());
    System.out.println("Chu vi hinh vuong" + hv1.tinhChuVi());
    System.out.println("Chu vi hinh vuong" + hv1.tinhDienTich());
    System.out.println("Chu vi hinh thoi" + ht.tinhChuVi());
    System.out.println("Dien tich hinh thoi" + ht.tinhDienTich());
   }
}
