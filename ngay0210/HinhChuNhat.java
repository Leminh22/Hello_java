package ngay0210;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

  HinhChuNhat(int chieuDai, int chieuRong){
    this.chieuDai = chieuDai;
    this.chieuRong = chieuRong;
  }
  public double tinhChuVi(){
    return 2 * (this.chieuDai + this.chieuRong);
  }
   public double tinhDienTich(){
    return this.chieuDai * this.chieuRong;
  }
  public static void main(String[] agra){

  }
} 
