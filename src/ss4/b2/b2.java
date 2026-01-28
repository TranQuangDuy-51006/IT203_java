package ss4.b2;


public class b2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";


        if (description.contains("Kệ:")) {
            int start = description.indexOf("Kệ:") + 4;
            int end = description.indexOf(",", start);
            String viTri;
            if (end == -1) {
                viTri = description.substring(start).trim();
            } else {
                viTri = description.substring(start, end).trim();
            }
            System.out.println("Vị trí tìm thấy: "+ viTri);
            description = description.substring(0, description.indexOf("Kệ:")) + "Vị trí lưu trữ: " + viTri + (end == -1 ? "" : description.substring(end));
        }
        System.out.println(description);
    }
}
