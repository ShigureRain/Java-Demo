import java.util.Scanner;

public class JavaOneEight {
    public static void main(String[] args){
        int foot;
        double inch;
        //获取输入
        Scanner in = new Scanner(System.in);
        //取输入的数字
        foot = in.nextInt();
        inch = in.nextDouble();//使他变成浮点数
        System.out.println((foot+inch/12.0)*0.3048); //要加.0，因为在Java里整数和整数的运算只能得到整数，12.0就是浮点数，可以得到小数，运算的两边一个是浮点就行
        System.out.println((int)((foot+inch/12.0)*0.3048*100)+"cm"); //类型转换为int,int放括号
    }
}
