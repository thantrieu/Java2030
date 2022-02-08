import java.util.Scanner;

/**
 * @author Branium Academy
 * @version 2022.02.08
 * @see <a href="https://braniumacademy.net/">...</a>
 */

public class Lesson21Exercises2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n không quá 90: ");
        var n = input.nextInt();
        if (n < 0) {
            System.out.println("Nhập số nguyên dương n.");
        } else {
            System.out.println("F" + n + " = " + fiboN(n));
        }
    }

    // phương thức tìm số fibonacci thứ n
    public static long fiboN(int n) {
        if (n < 2) { // điểm dừng
            return n;
        } else { // bước đệ quy
            return fiboN(n - 1) + fiboN(n - 2);
        }
    }
}
