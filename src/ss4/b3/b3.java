package ss4.b3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class b3 {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String today = LocalDate.now().format(formatter);

        long startBuilder = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        for (String t : transactions) {
            sb.append("Giao dịch: ").append(t).append("\n");
        }

        long endBuilder = System.currentTimeMillis();
        long startString = System.currentTimeMillis();

        String report = "--- BÁO CÁO MƯỢN SÁCH ---\n";

        for (String t : transactions) {
            report += "Giao dịch: " + t + "\n";
        }

        long endString = System.currentTimeMillis();

        System.out.println(sb.toString());

        System.out.println("Số thời gian thực thi đối với StringBuilder: "
                + (endBuilder - startBuilder));
        System.out.println("Số thời gian thực thi đối với String: "
                + (endString - startString));
    }
}
