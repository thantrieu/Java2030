import java.util.Scanner;

/**
 * @author Branium Academy
 * @version 2022.02.08
 * @see <a href="https://braniumacademy.net/">...</a>
 */

public class Lesson21Exercises1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n không quá 20: ");
        var n = input.nextInt();
        if (n < 0) {
            System.out.println("Nhập số nguyên dương n");
        } else {
            System.out.println(n + "! = " + factorial(n));
        }
    }

    // phương thức tính n! đệ quy
    public static long factorial(int n) {
        if (n < 2) { // điểm dừng
            return 1;
        } else { // bước đệ quy
            return n * factorial(n - 1);
        }
    }
}
