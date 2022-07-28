import java.util.Scanner;

public class JavaTwoOne {
    public static void main(String[] args) {
//        初始化
        Scanner in = new Scanner(System.in);
        int balance = 0;
//        读入投票金额
        while (true) {
            System.out.print("请投币");
            int amount = in.nextInt();
            System.out.println(amount);
//        System.out.println(amount >= 10);
            balance = balance + amount;
            if (balance >= 10) {
//        打印车票
                System.out.println("****************");
                System.out.println("*Java城际铁路专线*");
                System.out.println("*  无指定座位票  *");
                System.out.println("*   票价：10元  *");
                System.out.println("****************");
//        输出
                System.out.println("找零" + (balance - 10));
                balance = 0;
            } else {
                System.out.println("你买不起票！");
                System.out.println("还差" + (10 - balance) + "元");
            }
        }
    }
}
