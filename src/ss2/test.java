package ss2;

import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("n1 =");
        n1 = sc.nextInt();
        System.out.println("n2 =");
        n2 = sc.nextInt();
        for(int i = n1; i < n2; i++){
            boolean check = true;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    check = false;
                    break;
                }
            }
            if (check && i > 1) {
                System.out.println(i);
            }
        }
        sc.close();


        int [] arr = new int [10];
        System.out.println(arr[10]);
//
//        double soTien, laiSuat = 0, tongTien;
//        int thangGui, goiGui;
//        System.out.println("Nhap so tien: ");
//        soTien = sc.nextDouble();
//        System.out.println("Nhap thang gui: ");
//        thangGui = sc.nextInt();
//        System.out.println("Nhap goi: (thang)");
//        goiGui = sc.nextInt();
//        switch(goiGui){
//            case 1:
//                laiSuat = 0.04/12;
//                break;
//            case 2:
//                laiSuat = 0.045/12;
//                break;
//            case 3:
//                laiSuat = 0.05/12;
//                break;
//            case 4:
//                laiSuat = 0.55/12;
//                break;
//            case 6:
//                laiSuat = 0.6/12;
//                break;
//            case 9:
//                laiSuat = 0.65/12;
//                break;
//            case 12:
//                laiSuat = 0.07/12;
//                break;
//            default:
//                System.out.println("Khong co goi gui nao nhu the, Mat Tien!!!!");
//        }
//        if(laiSuat > 0) {
//            tongTien = laiSuat * soTien;
//        }

    }
}
