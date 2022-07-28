import java.util.Scanner;

public class JavaFiveOneThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int cnt;
        cnt = in.nextInt();
        if (cnt > 0) {
            int[] numbers = new int[cnt];//定义数组
            for (int i = 0; i < cnt; i++) {
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }
            double average = sum / cnt;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > average) {
                    System.out.println(numbers[i]);
                }
            }
            System.out.println(average);
        }
    }
}
