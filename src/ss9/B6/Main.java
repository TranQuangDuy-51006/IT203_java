package ss9.B6;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Rectangle(6)); // hình vuông

        double total = 0;

        System.out.println("Kết quả tính toán hình học:\n");

        int i = 1;

        for (Shape s : shapes) {

            double area = s.calculateArea();
            total += area;

            System.out.printf(
                    "%d. %s - Diện tích: %.2f\n\n",
                    i++, s, area
            );
        }

        System.out.printf("=> Tổng diện tích các hình: %.2f", total);
    }
}

