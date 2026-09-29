package sli29;

public class FormatSpecifier {
    public static void main(String[] args) {
        int i = 55 / 22; // Phép chia lấy phần nguyên trong số nguyên = 2
        // In số nguyên dưới dạng thập phân (%d), kết thúc bằng xuống dòng (%n)
        System.out.printf("55/22 = %d %n", i);

        // Đệm số 0 (%09.3f: tổng độ dài tối thiểu 9 ký tự, lấp đầy khoảng trống bằng số 0, lấy 3 chữ số thập phân)
        double q = 1.0 / 2.0; // 0.5
        System.out.printf("1.0/2.0 = %09.3f %n", q);

        // Định dạng theo ký hiệu khoa học (%7.2e)
        q = 5000.0 / 3.0;
        System.out.printf("5000/3.0 = %7.2e %n", q);

        // Xử lý số âm vô cực (Negative infinity) khi chia một số cho 0.0
        q = -10.0 / 0.0;
        System.out.printf("-10.0/0.0 = %7.2e %n", q);

        // Truyền nhiều tham số cùng lúc (In giá trị hằng số Math.PI và Math.E)
        System.out.printf("pi = %5.3f, e = %5.4f %n", Math.PI, Math.E);
    }



}
