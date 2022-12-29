import java.util.Scanner;

/**
 * @author Branium Academy
 * @version 2022.12.29
 * @see <a href="https://braniumacademy.net/">...</a>
 */

public class Ex4 {
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    static class DayOfWeekVNKey {
        public static final String THU_HAI = "thứ hai";
        public static final String THU_BA = "thứ ba";
        public static final String THU_TU = "thứ tư";
        public static final String THU_NAM = "thứ năm";
        public static final String THU_SAU = "thứ sáu";
        public static final String THU_BAY = "thứ bảy";
        public static final String CHU_NHAT = "chủ nhật";
        public static final String INVALID = "Invalid day of week";
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập tên ngày của tuần-> ");
        var dayOfWeek = input.nextLine();
        var result = ""; // biến lưu kết quả chuyển đổi
        // tiến hành kiểm tra và đánh giá
        dayOfWeek = dayOfWeek.toLowerCase(); // viết thường hết cho dễ so sánh
        dayOfWeek = dayOfWeek.trim(); // loại bỏ hết các dấu cách thừa
        // vào switch expression
        result = getDayOfWeek(dayOfWeek);
        System.out.println("Kết quả chuyển đổi-> ");
        System.out.println(dayOfWeek + " -> " + result);
    }

    /**
     * trả về ngày trong tuần bằng tiếng anh tương ứng
     *
     * @param day tên ngày của tuần trong tiếng Việt
     * @return ngày của tuần đã chuyển sang tiếng Anh
     */
    private static String getDayOfWeek(String day) {
        // phương thức name() trả về tên hằng số trong enum
        return switch (day) {
            case DayOfWeekVNKey.THU_HAI -> DayOfWeek.MONDAY.name();
            case DayOfWeekVNKey.THU_BA -> DayOfWeek.TUESDAY.name();
            case DayOfWeekVNKey.THU_TU -> DayOfWeek.WEDNESDAY.name();
            case DayOfWeekVNKey.THU_NAM -> DayOfWeek.THURSDAY.name();
            case DayOfWeekVNKey.THU_SAU -> DayOfWeek.FRIDAY.name();
            case DayOfWeekVNKey.THU_BAY -> DayOfWeek.SATURDAY.name();
            case DayOfWeekVNKey.CHU_NHAT -> DayOfWeek.SUNDAY.name();
            default -> DayOfWeekVNKey.INVALID;
        };
    }
}
