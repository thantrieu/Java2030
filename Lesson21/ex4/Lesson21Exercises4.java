import java.util.Scanner;

/**
 * @author Branium Academy
 * @version 2022.02.08
 * @see <a href="https://braniumacademy.net/">...</a>
 */

public class Lesson21Exercises4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        printRevert(n);
    }

    // phương thức in ra các chữ số của n theo thứ tự đảo ngược
    public static void printRevert(int n) {
        if (n > 0) { // điều kiện để tiếp tục
            System.out.print(n % 10);
            printRevert(n / 10); // giảm n đi 10 lần để loại bỏ phần đơn vị
        }
    }
}
