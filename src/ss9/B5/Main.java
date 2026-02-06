package ss9.B5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyen Van A", 10_000_000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20_000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30_000));

        double total = 0;

        System.out.println("Danh sách lương nhân viên:");

        int i = 1;
        for (Employee e : employees) {

            double salary = e.calculateSalary(); // đa hình runtime
            total += salary;

            System.out.printf(
                    "%d. %s - Lương: %,.0f\n",
                    i++, e.getName(), salary
            );
        }

        System.out.printf("\n=> TỔNG LƯƠNG CÔNG TY: %,.0f", total);
    }
}

