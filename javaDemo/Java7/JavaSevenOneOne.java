import java.util.Scanner;

public class JavaSevenOneOne {
    public static void sum(int a,int b){//����ͷ��sum��������void�������ͣ������ڲ�����
        int i;
        int sum = 0;
        for( i = a; i<=b;i++){
            sum += i;
        }
        System.out.println(a+"��"+b+"�ĺ���"+sum);//������
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        sum(1,10);//ִ�к���
        sum(20,30);
        sum(35,45);
    }
}
