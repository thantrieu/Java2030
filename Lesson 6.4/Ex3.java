import java.util.Scanner;

/**
 * @author Branium Academy
 * @version 2022.12.29
 * @see <a href="https://braniumacademy.net/">...</a>
 */

public class Ex3 {
    enum Zodiac {
        ARIES("BẠCH DƯƠNG"), TAURUS("KIM NGƯU"), GEMINI("SONG TỬ"),
        CANCER("CỰ GIẢI"), LEO("SƯ TỬ"), VIRGO("XỬ NỮ"),
        LIBRA("THIÊN BÌNH"), SCORPIUS("BỌ CẠP"), SAGITTARIUS("NHÂN MÃ"),
        CAPRICORN("MA KẾT"), AQUARIUS("BẢO BÌNH"), PISCES("SONG NGƯ");

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
        System.out.println("Nhập ngày sinh tháng sinh cách nhau bởi 1 dấu cách: ");
        var day = input.nextInt();
        var month = input.nextInt();
        // biến lưu tên con giáp
        var zodiac = "";
        // ta xét tháng trước ngày sau vì số tháng ít hơn số ngày, dễ kiểm tra
        zodiac = getZodiac(day, month);
        System.out.println("Cung hoàng đạo nhà bạn là: " + zodiac);
    }

    /**
     * phương thức trả về giá trị cung hoàng đạo tương ứng
     *
     * @param day   ngày sinh
     * @param month tháng sinh
     * @return tên cung hoàng đạo ở tiếng Việt
     */
    private static String getZodiac(int day, int month) {
        final String INVALID_DAY = "Ngày không hợp lệ";
        final String INVALID_MONTH = "Tháng không hợp lệ. Vui lòng kiểm tra lại.";
        return switch (month) {
            case 1 -> (day < 20) ? Zodiac.CAPRICORN.getValue()
                    : (day <= 31) ? Zodiac.AQUARIUS.getValue()
                    : INVALID_DAY;
            case 2 -> (day < 19) ? Zodiac.AQUARIUS.getValue()
                    : (day <= 29) ? Zodiac.PISCES.getValue()
                    : INVALID_DAY;
            case 3 -> (day < 21) ? Zodiac.PISCES.getValue()
                    : (day <= 31) ? Zodiac.ARIES.getValue()
                    : INVALID_DAY;
            case 4 -> (day < 21) ? Zodiac.ARIES.getValue()
                    : (day <= 30) ? Zodiac.TAURUS.getValue()
                    : INVALID_DAY;
            case 5 -> (day < 21) ? Zodiac.TAURUS.getValue()
                    : (day <= 31) ? Zodiac.GEMINI.getValue()
                    : INVALID_DAY;
            case 6 -> (day < 22) ? Zodiac.GEMINI.getValue()
                    : (day <= 30) ? Zodiac.CANCER.getValue()
                    : INVALID_DAY;
            case 7 -> (day < 23) ? Zodiac.CANCER.getValue()
                    : (day <= 31) ? Zodiac.LEO.getValue()
                    : INVALID_DAY;
            case 8 -> (day < 23) ? Zodiac.LEO.getValue()
                    : (day <= 31) ? Zodiac.VIRGO.getValue()
                    : INVALID_DAY;
            case 9 -> (day < 23) ? Zodiac.VIRGO.getValue()
                    : (day <= 30) ? Zodiac.LIBRA.getValue()
                    : INVALID_DAY;
            case 10 -> (day < 24) ? Zodiac.LIBRA.getValue()
                    : (day <= 31) ? Zodiac.SCORPIUS.getValue()
                    : INVALID_DAY;
            case 11 -> (day < 23) ? Zodiac.SCORPIUS.getValue()
                    : (day <= 30) ? Zodiac.SAGITTARIUS.getValue()
                    : INVALID_DAY;
            case 12 -> (day < 22) ? Zodiac.SAGITTARIUS.getValue()
                    : (day <= 31) ? Zodiac.CAPRICORN.getValue()
                    : INVALID_DAY;
            default -> INVALID_MONTH;
        };
    }
}
