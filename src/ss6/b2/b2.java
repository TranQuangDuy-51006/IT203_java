package ss6.b2;

public class b2 {
    static class Account {
        String username;
        String password;
        String email;

        public Account(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public void doiMatKhau(String matKhauMoi) {
            this.password = matKhauMoi;
        }

        public void hienThiThongTin() {
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: ********");
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {

        Account acc = new Account("jiren", "000000", "jiren@gmail.com");

        System.out.println("Thong tin tai khoan ban dau:");
        acc.hienThiThongTin();

        acc.doiMatKhau("123456");

        System.out.println("Thong tin tai khoan sau khi doi mat khau:");
        acc.hienThiThongTin();
    }
}
