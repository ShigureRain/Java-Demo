import java.util.Scanner;

public class JavaThreeTwoThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = (int) (Math.random() * 100 + 1); //[1,100]
        int a;
        int count = 1;
        a = in.nextInt();
        while (a != number) {
            if (a > number) {
                System.out.println("偏大");
            } else if (a < number) {
                System.out.println("偏小");
            }
            count = count + 1;
            a = in.nextInt();
        }
        System.out.println("恭喜你猜对了，你猜了" + count + "次");
    }
}
