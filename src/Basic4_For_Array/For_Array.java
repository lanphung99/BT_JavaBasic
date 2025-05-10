package Basic4_For_Array;

public class For_Array {
    public static void main(String[] args) {

        //Tìm số chắn
        int count = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count ++; //Mỗi lần gặp số chắn tăng cout lên 1
            }
        }
        System.out.println(" ");
        System.out.println("Từ 0 đến 50 có: " + count + " số chẵn");

        //Gán các số chẵn vào mảng
        int soChan[] = new int[26]; //Từ 0 đến 50 có 26 số chẵn
        int index = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                soChan[index] = i; //Gán giá trị số chẵn vào vị trí mảng tuần tự
                index++; //Tag biến chỉ mục lên 1 đơn vị
            }
        }

        //Duyệt mảng, in mảng các số chẵn đã lưu
        System.out.println("Các số chẵn đã được lưu trong mảng là: ");

        for (int value : soChan) {
            System.out.print(value + " ");
        }

        //for (int i = 0; i < soChan.length; i++) {
        //    System.out.print(soChan[i] + " ");
        //}

    }
}
