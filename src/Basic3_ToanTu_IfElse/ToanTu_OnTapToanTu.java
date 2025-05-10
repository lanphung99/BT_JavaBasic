package Basic3_ToanTu_IfElse;

public class ToanTu_OnTapToanTu {

    // Biến cố định
    static int number = 100;

    // 3 biến bất kỳ
    int a = 50;
    int b = 150;
    boolean c = true;

    // Hàm kiểm tra toán tử quan hệ và logic
    public void kiemTraToanTu() {
        System.out.println("Toán tử quan hệ");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        System.out.println("Toán tử logic");
        System.out.println("(a < b) && c: " + ((a < b) && c));
        System.out.println("(a > b) || c: " + ((a > b) || c));
    }

    // Hàm kiểm tra tham số n truyền vào từ hàm main so với biến number
    public void soSanhVoiNumber(int n) {

        if (n == number) {
            System.out.println("n bằng 100");
        } else if (n < number) {
            System.out.println("n nhỏ hơn 100");
        } else {
            System.out.println("n lớn hơn 100");
        }
    }

    public static void main(String[] args) {
        ToanTu_OnTapToanTu onTapToanTu = new ToanTu_OnTapToanTu();

        onTapToanTu.kiemTraToanTu();

        onTapToanTu.soSanhVoiNumber(50);
    }
}
