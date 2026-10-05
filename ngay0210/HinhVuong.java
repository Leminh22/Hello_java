package ngay0210;

public class HinhVuong {
    private int canh;
    HinhVuong(int canh){
    this.canh = canh;
}

public int tinhChuVi(){
    return canh * 4;
}

public int tinhDienTich(){
    return canh * canh;
}

}



