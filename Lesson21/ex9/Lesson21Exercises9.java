import java.util.Scanner;

/**
 * @author Branium Academy
 * @version 2022.02.08
 * @see <a href="https://braniumacademy.net/">...</a>
 */

public class Lesson21Exercises9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        var sum = add(n);
        System.out.println("S = 1 + ... + n = " + sum);
    }

    // phương thức tính toán S = 1 + ... + n
    private static int add(int n) {
        if (n == 1) { // điểm dừng
            return 1;
        } else { // bước đệ quy
            return n + add(n - 1);
        }
    }
}
