package ngay0210;

public class HinhThoi {
private int canh;
private int duongCheo1;
private int duongCheo2;

HinhThoi(int canh, int duongCheo1, int duongCheo2){
    this.canh = canh;
    this.duongCheo1 = duongCheo1;
    this.duongCheo2 = duongCheo2;
}
public double tinhChuVi(){
    return canh * 4;
}
public double tinhDienTich(){
    return 0.5 *  duongCheo1 * duongCheo2;
}
}
