package ss4.b1;

import java.util.Scanner;

public class b1 {
    public static String format(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Title: ");
        String title = sc.nextLine().trim().replaceAll("\\s+", " ");
        System.out.println("Author: ");
        String author = sc.nextLine().trim().replaceAll("\\s+", " ");

        title = title.toUpperCase();
        author = format(author);

        System.out.println("[" + title + "] - Tác giả: " + author);
        sc.close();
    }
}
