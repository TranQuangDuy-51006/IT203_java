package ss3.b2;

import java.util.Scanner;

public class b2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] books = {
                "Lap trinh Java",
                "Lap trinh C++",
                "Lap trinh Python",
                "Lap trinh Web",
                "Lap trinh Mobile"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach can tim: ");
        String name = sc.nextLine();

        int pos = searchBooks(books, name);
        if (pos >= 0) {
            System.out.println("Tim thay sach " + name + " tai vi tri " + pos);
        } else {
            System.out.println("Sach khong ton tai trong thu vien");
        }
    }
}
