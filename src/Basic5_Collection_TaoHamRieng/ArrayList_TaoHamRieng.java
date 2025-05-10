package Basic5_Collection_TaoHamRieng;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_TaoHamRieng {

    //Hàm thêm thông tin của nhân viên vào collection
    private static List<String> addEmployee(String name, String address, String email) {

        List<String> employeeInfo = new ArrayList<>();

        employeeInfo.add(name);
        employeeInfo.add(address);
        employeeInfo.add(email);

        return employeeInfo;
    }


    public static void main(String[] args) {
        System.out.println("=================== ArrayList số chẵn =================");
        List<Integer> list = new ArrayList<>();

        //Kiểm tra số chẵn, add vào ArrayList
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }

        //Duyệt giá trị trong ArrayList
        for (int value : list) {
            System.out.print(value + "\t");
        }


        System.out.println("\n\n=================== Thông tin nhân viên =================");

        //Biến trung gian để lấy giá trị trong hàm addEmployee trả về
        List<String> employee = addEmployee("Lan Phụng", "Cần Thơ", "nnlphung@gmail.com");

        System.out.println(" ");
        //In thông tin nhân viên trong ArrayList
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(employee.get(i));
        }

        //for (String value : employee) {
        //    System.out.println(value);
        //}


    }
}
