package ss6.b1;

public class b1 {
    static class Student {
        String maSinhVien;
        String hoTen;
        int namSinh;
        double diemTrungBinh;

        public Student(String maSinhVien, String hoTen, int namSinh, double diemTrungBinh) {
            this.maSinhVien = maSinhVien;
            this.hoTen = hoTen;
            this.namSinh = namSinh;
            this.diemTrungBinh = diemTrungBinh;
        }

        public void hienThiThongTin() {
            System.out.println("Ma sinh vien: " + maSinhVien);
            System.out.println("Ho ten: " + hoTen);
            System.out.println("Nam sinh: " + namSinh);
            System.out.println("Diem trung binh: " + diemTrungBinh);
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {

        Student sv1 = new Student("SV001", "Nguyen Van A", 2006, 9.9);
        Student sv2 = new Student("SV002", "Tran Thi B", 2003, 6.8);

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}
