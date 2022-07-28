import java.util.Scanner;

public class Rain {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        int amount = 0;
        int price = 0;
        System.out.print("请输入票面");
        amount = in.nextInt();
        System.out.print("请输入金额");
        price = in.nextInt();
        System.out.println(amount+"-" + price + "=" + (amount - price));
    }
}
