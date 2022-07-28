import java.util.Scanner;

public class JavaFourTwoTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        for (int n = 2; n < 100; n++) {
//            int isPrime = 1;
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    isPrime = 0;
//                    break;
//                }
//            }
//            if (isPrime == 1) {
//                System.out.print(n + " ");
//            } else {
//
//            }
//        }
        int n = 1;
        int i = 3;
        while (n <= 50) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    System.out.print(i + " ");
                    n++;
                    break;
                }
            }
            i++;
        }

    }
}
