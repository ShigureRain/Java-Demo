import java.util.Scanner;

public class JavaSevenOneOne {
    public static void sum(int a,int b){//函数头，sum函数名，void返回类型，括号内参数表
        int i;
        int sum = 0;
        for( i = a; i<=b;i++){
            sum += i;
        }
        System.out.println(a+"到"+b+"的和是"+sum);//函数体
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        sum(1,10);//执行函数
        sum(20,30);
        sum(35,45);
    }
}
