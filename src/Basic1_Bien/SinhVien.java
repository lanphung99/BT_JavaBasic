package Basic1_Bien;

public class SinhVien {

    //Biến local
    String name = "Lan Phụng";

    //Biến instance
    public void age() {
        int age = 26;
        System.out.println("Age: " + age);
    }

    //Biến static
    static String email = "nnlphung@gmail.com";

    public static void main(String[] args) {
        //Biến instance
        int year = 1999;

        //Gọi biến local
        SinhVien sinhVien = new SinhVien();
        System.out.println("Name: " + sinhVien.name);

        //Gọi biến instance
        sinhVien.age();
        System.out.println("Year: " + year);

        //Gọi biến static
        System.out.println("Email: " + email);

        //Gọi biến ở class ThongTin
        System.out.println("Address: " + ThongTin.ADDRESS);
        System.out.println("Phone: " + ThongTin.PHONE);
    }
}
