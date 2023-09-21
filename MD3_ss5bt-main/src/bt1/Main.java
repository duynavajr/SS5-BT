package bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 1 chuỗi bất kỳ");
        String str = sc.nextLine();
//        String str = "xin chào các bạn";
        if(str.isEmpty()){
            System.out.println("chuỗi rỗng");
        }else{
            System.out.println("chuỗi không rỗng");
        }

    }
}
