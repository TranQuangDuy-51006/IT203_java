package ss9.B1;

class Student extends Person {
    private String studentId;
    private double gpa;

    // Constructor
    public Student(String name, int age, String studentId, double gpa) {
        super(name, age); // gọi constructor lớp cha
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Ghi đè phương thức hiển thị
    @Override
    public void displayInfo() {
        super.displayInfo(); // dùng lại code lớp cha
        System.out.println("Mã SV: " + studentId);
        System.out.println("Điểm TB: " + gpa);
    }
}
