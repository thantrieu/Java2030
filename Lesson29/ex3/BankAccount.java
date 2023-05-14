import java.text.DecimalFormat;

/**
 * lớp này mô tả thông tin tài khoản ngân hàng của Wakanda
 *
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */
public class BankAccount {
    // các thuộc tính:
    private String accNumber;    // số tài khoản
    private String owner;        // chủ tài khoản
    private String type;         // loại tài khoản(vd: tiết kiệm)
    private long balance;       // số dư
    private String bankName;     // tên ngân hàng
    private String startDate;    // ngày phát hành
    private String endDate;      // ngày hết hạn

    // phương thức khởi tạo mặc định
    public BankAccount() {
        accNumber = "";
        owner = "";
        type = "";
        balance = 0;
        bankName = "";
        startDate = "";
        endDate = "";
    }

    // phương thức khởi tạo 1 tham số
    public BankAccount(String accNumber) {
        this.accNumber = accNumber;
    }

    // phương thức khởi tạo 2 tham số
    public BankAccount(String accNumber, String owner) {
        this(accNumber); // gọi constructor 1 tham số
        this.owner = owner;
    }

    // phương thức khởi tạo 3 tham số
    public BankAccount(String accNumber, String owner, String type) {
        this(accNumber, owner); // gọi constructor 2 tham số
        this.type = type;
    }

    // phương thức khởi tạo 4 tham số
    public BankAccount(String accNumber, String owner,
                       String type, long balance) {
        this(accNumber, owner, type); // gọi constructor 3 tham số
        this.balance = balance;
    }

    // phương thức khởi tạo 5 tham số
    public BankAccount(String accNumber, String owner,
                       String type, long balance, String bankName) {
        this(accNumber, owner, type, balance); // gọi constructor 4 tham số
        this.bankName = bankName;
    }

    // phương thức khởi tạo 6 tham số
    public BankAccount(String accNumber, String owner, String type,
                       long balance, String bankName, String startDate) {
        // gọi constructor 5 tham số
        this(accNumber, owner, type, balance, bankName);
        this.startDate = startDate;
    }

    // phương thức khởi tạo 7 tham số
    public BankAccount(String accNumber, String owner,
                       String type, long balance,
                       String bankName, String startDate, String endDate) {
        // gọi constructor 6 tham số
        this(accNumber, owner, type, balance, bankName, startDate);
        this.endDate = endDate;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    // nạp tiền vào tk ngân hàng
    public boolean deposit(long amount) {
        if (amount > 0) {
            balance += amount;
            return true; // gửi tiền vào tk thành công
        }
        return false; // gửi tiền vào tài khoản thất bại
    }

    // rút tiền
    public boolean withdraw(long amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            return true;
        }
        return false; // rút thất bại
    }

    // chuyển khoản từ tài khoản nguồn(hiện tại) sang tài khoản đích(tk nhận)
    public boolean bankTransfer(BankAccount other, long amount) {
        // nếu số tiền cần chuyển hợp lệ
        if (0 < amount && amount < balance) {
            balance -= amount; // giảm số tiền ở Tk hiện thời
            other.balance += amount; // tăng số tiền ở tk đích
            return true; // chuyển khoản thành công
        }
        return false; // chuyển khoản thất bại
    }

    // kiểm tra số dư:
    public void checkAccBallance() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.println("Số tài khoản: " + accNumber);
        System.out.println("Số dư của bạn hiện tại là: " + formatter.format(balance));
    }

    // thanh toán các dịch vụ khác
    public boolean pay(String service, long amount) {
        if (!service.isEmpty() && amount > 0 && amount < balance) {
            balance -= amount;
            return true; // thanh toán thành công
        }
        return false; // thanh toán thất bại
    }
}
