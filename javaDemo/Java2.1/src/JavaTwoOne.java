import java.util.Scanner;

public class JavaTwoOne {
    public static void main(String[] args) {
//        ��ʼ��
        Scanner in = new Scanner(System.in);
        int balance = 0;
//        ����ͶƱ���
        while (true) {
            System.out.print("��Ͷ��");
            int amount = in.nextInt();
            System.out.println(amount);
//        System.out.println(amount >= 10);
            balance = balance + amount;
            if (balance >= 10) {
//        ��ӡ��Ʊ
                System.out.println("****************");
                System.out.println("*Java�Ǽ���·ר��*");
                System.out.println("*  ��ָ����λƱ  *");
                System.out.println("*   Ʊ�ۣ�10Ԫ  *");
                System.out.println("****************");
//        ���
                System.out.println("����" + (balance - 10));
                balance = 0;
            } else {
                System.out.println("������Ʊ��");
                System.out.println("����" + (10 - balance) + "Ԫ");
            }
        }
    }
}
