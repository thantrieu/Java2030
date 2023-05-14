import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {
        // giả định ta có 2 tài khoản:
        BankAccount acc = new BankAccount("0021001", "LE CONG TUAN", "Debit", 125_000_000);
        BankAccount acc2 = new BankAccount("0021002", "MAI DUC TRUNG", "Debit", 15_000_000);
        var input = new Scanner(System.in);
        showAccInfo(acc);

        // thực hiện các thanh toán:
        System.out.println("Nhập số tiền muốn rút: ");
        var amount = input.nextLong();
        if (acc.withdraw(amount)) {
            System.out.println("Rút thành công");
            acc.checkAccBallance();
        } else {
            System.out.println("==> LỖI: Số dư của bạn không đủ.");
        }

        input.nextLine(); // đọc bỏ dòng thừa
        System.out.println("Bạn có muốn tiếp tục giao dịch? (y/n)");
        var choice = input.nextLine(); // nhập y/n
        if (choice.toLowerCase().compareTo("y") == 0) {
            System.out.println("Nhập số tài khoản nhận tiền: ");
            var targetAccNumber = input.nextLine();
            System.out.println("Nhập số tiền muốn chuyển: ");
            var transferAmount = input.nextInt();
            if (targetAccNumber.compareTo(acc2.getAccNumber()) == 0) {
                if (acc.bankTransfer(acc2, transferAmount)) {
                    System.out.println("==> Chuyển tiền thành công!");
                } else {
                    System.out.println("==> Số tiền cần chuyển vượt quá số dư khả dụng." +
                            "\nChuyển tiền thất bại!");
                }
            } else {
                System.out.println("==> LỖI: Tài khoản nhận tiền không tồn tại.");
            }
            System.out.println("============================");
            showAccInfo(acc);
            showAccInfo(acc2);
            // todo: tự bổ sung các thao tác khác nếu muốn
        } else {
            System.out.println("==> LỖI: Lựa chọn không hợp lệ!");
        }
    }

    private static void showAccInfo(BankAccount account) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.println("Số TK: " + account.getAccNumber());
        System.out.println("Tên TK: " + account.getOwner());
        System.out.println("Loại TK: " + account.getType());
        System.out.println("Số dư: " + formatter.format(account.getBalance()));
        System.out.println("Thời điểm tra cứu: " + new Date());
        System.out.println("=============================");
    }
}
