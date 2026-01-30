package ss4.b5;

public class b5 {
    public static void main(String[] args) {
        { String[] logs = { "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345" };

            int borrow = 0;
            int ret = 0;
            for(int i = 0; i < logs.length; i++) {
                String[] parts = logs[i].split(" //| ");

                String date = parts[0];

                String user = parts[1].replace("User: ", "");

                String action = parts[2].replace("Action: ", "");

                String bookID = parts[3].replace("BookID: ", "");

                System.out.println("Ngày: " + date);
                System.out.println("Người dùng: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookID);
                if (action.equals("BORROW")){
                    borrow++;
                }
                if (action.equals("RETURN")){
                    ret++;
                }
                System.out.println("borrow: "+ borrow+", return: "+ ret);
            }
        }
    }
}
