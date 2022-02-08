import java.util.Scanner;

/**
 * @author Branium Academy
 * @version 2022.02.08
 * @see <a href="https://braniumacademy.net/">...</a>
 */

public class Lesson21Exercises5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        System.out.println("Số chữ số của n: " + countDigits(n));
    }

    // phương thức đệ quy đếm số chữ số của n
    public static int countDigits(int n) {
        if (n < 10) { // điều kiện dừng
            return 1;
        } else { // bước đệ quy
            return 1 + countDigits(n / 10);
        }
    }
}
