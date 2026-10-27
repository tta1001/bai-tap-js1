public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accNum, String name, double initialBalance) {
        accountNumber = accNum;
        ownerName = name;
        
        if (initialBalance < 0) {
            balance = 0;
            System.out.println("Lỗi: Số dư ban đầu không được âm!");
        } else {
            balance = initialBalance;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp tiền thành công! Số dư hiện tại: " + balance);
        } else {
            System.out.println("Lỗi: Số tiền nạp phải lớn hơn 0!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rút tiền thành công! Số dư còn lại: " + balance);
        } else {
            System.out.println("Lỗi: Số tiền rút không hợp lệ hoặc vượt quá số dư!");
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", "Nguyen Van A", 1000.0);
        acc.deposit(500.0);
        acc.withdraw(200.0);
        System.out.println("Tên chủ thẻ: " + acc.getOwnerName());
        System.out.println("Số dư cuối cùng: " + acc.getBalance());
    }
}