package ss2;

import java.util.Scanner;

public class test {

    public static String reverse(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }
        String[] words = input.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 6) {
            System.out.println("------MENU------");
            System.out.println("1.Tim cap so co tong bang K ");
            System.out.println("2.Don so 0 ve cuoi: ");
            System.out.println("3.Kiem tra chuoi doi xung");
            System.out.println("4.Dao nguoc tu trong cau");
            System.out.println("5.So hanh phuc ");
            System.out.println("6.Thoat chuong trinh");
            System.out.printf("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("vc");
                    break;
                case 4:
                    System.out.print("Nhập chuỗi: ");
                    String input = sc.nextLine();
                    String result = reverse(input);
                    System.out.println(result);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Lua chon khong hop le!!");
            }
        }
    }

}
