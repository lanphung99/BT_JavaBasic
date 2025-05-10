package Basic2_Ham;

public class Calculator {

    public void tong2SoNguyen (int a, int b) {
        System.out.println("Tổng 2 số nguyên là: " + (a+b));
    }

    public void tich2SoThuc (double c, double d) {
        System.out.println("Tích 2 số thực là: " + (c*d));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.tong2SoNguyen(5,6);
        calculator.tich2SoThuc(5,10);
    }

}
