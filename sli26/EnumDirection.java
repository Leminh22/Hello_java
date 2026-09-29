package sli26;

public class EnumDirection {
    //1. Khai báo kiểu liệt kê (enum) Direction với các giá trị NORTH, SOUTH, EAST, WEST
    // Gồm 4 hằng số đại diện cho các hướng : Đông, Tây, Nam, Bắc
    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    public static void main(String[] args) {
        //2. Khai báo biến kiểu dữ liệu là Direction
        Direction direction;
        //3. Gán giá trị cho biến direction là NORTH
        direction = Direction.NORTH;
        //4 . In giá trị của biến ra màn hình
        // kết quả sẽ hiển thị : Value: NORTH
        System.out.println("Value: " + direction);
    }

}

