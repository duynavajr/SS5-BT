package bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi 1");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi 2");
        String str2 = sc.nextLine();
//        String str1 = "Hello Every Body";
//        String str2 = "Hello Every Body";
        if(str1.equals(str2)){
            System.out.println("Chuỗi giống nhau");
        }else {
            System.out.println("Chuỗi khác nhau");
        }
    }
}
