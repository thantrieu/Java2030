import java.util.Scanner;

/**
 * @author Branium Academy
 * @version 2022.12.29
 * @see <a href="https://braniumacademy.net/">...</a>
 */

public class Ex2 {
    enum Zodiac {
        THE_RAT("TÝ"), THE_OX("SỬU"), THE_TIGER("DẦN"),
        THE_CAT("MÃO"), THE_DRAGON("THÌN"), THE_SNAKE("TỴ"),
        THE_HORSE("NGỌ"), THE_GOAT("MÙI"), THE_MONKEY("THÂN"),
        THE_ROOTSTER("DẬU"), THE_DOG("TUẤT"), THE_PIG("HỢI");

        private final String value;

        Zodiac(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập giá trị số từ 1-12: ");
        var number = input.nextInt();
        String zodiac = getZodiac(number);
        System.out.println("STT " + number + " là con giáp: " + zodiac);
    }

    /**
     * Phương thức trả về con giáp thứ i tương ứng
     *
     * @param number số thứ tự của con giáp
     * @return tên con giáp tương ứng với số thứ tự
     */
    private static String getZodiac(int number) {
        return switch (number) {
            case 0 -> "Kết thúc chương trình";
            case 1 -> Zodiac.THE_RAT.getValue();
            case 2 -> Zodiac.THE_OX.getValue();
            case 3 -> Zodiac.THE_TIGER.getValue();
            case 4 -> Zodiac.THE_CAT.getValue();
            case 5 -> Zodiac.THE_DRAGON.getValue();
            case 6 -> Zodiac.THE_SNAKE.getValue();
            case 7 -> Zodiac.THE_HORSE.getValue();
            case 8 -> Zodiac.THE_GOAT.getValue();
            case 9 -> Zodiac.THE_MONKEY.getValue();
            case 10 -> Zodiac.THE_ROOTSTER.getValue();
            case 11 -> Zodiac.THE_DOG.getValue();
            case 12 -> Zodiac.THE_PIG.getValue();
            default -> "Giá trị không hợp lệ. Vui lòng nhập giá trị [1-12]";
        };
    }

    /**
     * Phương thức trả về tên con giáp theo số thứ tự
     * @param order số thứ tự của con giáp
     * @return tên con giáp hoặc thông điệp tương ứng
     */
    private static String getZodiacOldJava(int order) {
        String result;
        switch (order) {
            case 0:
                result = "Kết thúc chương trình";
                break;
            case 1:
                result = Zodiac.THE_RAT.getValue();
                break;
            case 2:
                result = Zodiac.THE_OX.getValue();
                break;
            case 3:
                result = Zodiac.THE_TIGER.getValue();
                break;
            case 4:
                result = Zodiac.THE_CAT.getValue();
                break;
            case 5:
                result = Zodiac.THE_DRAGON.getValue();
                break;
            case 6:
                result = Zodiac.THE_SNAKE.getValue();
                break;
            case 7:
                result = Zodiac.THE_HORSE.getValue();
                break;
            case 8:
                result = Zodiac.THE_GOAT.getValue();
                break;
            case 9:
                result = Zodiac.THE_MONKEY.getValue();
                break;
            case 10:
                result = Zodiac.THE_ROOTSTER.getValue();
                break;
            case 11:
                result = Zodiac.THE_DOG.getValue();
                break;
            case 12:
                result = Zodiac.THE_PIG.getValue();
                break;
            default:
                result = "Giá trị không hợp lệ. Vui lòng nhập giá trị [1-12]";
                break;
        }
        return result;
    }
}
