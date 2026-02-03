package ss8.HN_KS24_CNTT4_;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] list = new Student[100];
    static int count = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== QUAN LY DIEM SINH VIEN =====");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo hoc luc");
            System.out.println("4. Sap xep theo hoc luc giam dan");
            System.out.println("5. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    nhapSinhVien();
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    timTheoHocLuc();
                    break;
                case 4:
                    sapXepHocLuc();
                    break;
                case 5:
                    System.out.println("Da thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 5);
    }

    // 1
    static void nhapSinhVien() {
        System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));

            System.out.print("Ma SV: ");
            String id = sc.nextLine();

            System.out.print("Ten: ");
            String name = sc.nextLine();

            System.out.print("Diem TB: ");
            double score = sc.nextDouble();
            sc.nextLine();

            list[count++] = new Student(id, name, score);
        }
    }

    // 2
    static void hienThi() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
    }

    // 3
    static void timTheoHocLuc() {
        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (list[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(list[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong co sinh vien phu hop!");
        }
    }

    // 4.
    static void sapXepHocLuc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (mucHocLuc(list[i]) < mucHocLuc(list[j])) {
                    Student temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println("Da sap xep xong!");
    }


    static int mucHocLuc(Student s) {
        switch (s.getRank()) {
            case "Gioi": return 3;
            case "Kha": return 2;
            case "Trung Binh": return 1;
            default: return 0;
        }
    }
}
