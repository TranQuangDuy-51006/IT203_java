package ss9.B3;

class Manager extends Employee {
    private String department;

    // Constructor lớp con
    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary); // ⚠ phải là dòng đầu tiên
        this.department = department;
    }

    // Hiển thị đầy đủ thông tin
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phòng ban: " + department);
    }
}
