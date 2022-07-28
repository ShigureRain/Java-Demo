import java.util.Scanner;

public class JavaFiveTwoFour {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i, j;
        final int SIZE = 3;//the size of SIZE is three
        //tic-tac-toe
        int[][] board = new int[SIZE][SIZE];
        System.out.println("玩家1输入“1”，玩家2输入“0”");
        for (i = 0; i < board.length; i++)//获取数组,1 代表 x,0 代表 o;
        {
            for (j = 0; j < board[i].length; j++) {
                board[i][j] = in.nextInt();
            }
        }
        boolean GotResult = false;
        //Jude row column Diagonal diagonal line
        int num1 = 0;
        int num2 = 0;
        //Judge row and column
        for (i = 0; i < board.length; i++) {
            num1 = 0;
            num2 = 0;
            for (j = 0; j < board[i].length; j++)//row
            {
                if (board[i][j] == 1) {
                    num1++;
                }
            }
            for (j = 0; j < board[i].length; j++)//column
            {
                if (board[j][i] == 1) {
                    num2++;
                }
            }
            if (num1 == SIZE || num2 == SIZE) {
                System.out.println("玩家1 win!");
                GotResult = true;
                break;
            }
            if (num2 == 0 || num1 == 0) {
                System.out.println("玩家2 win!");
                GotResult = true;
                break;
            }
        }

        if (GotResult == false) {
            num1 = 0;
            num2 = 0;
            //Judge diagonal diagonal line
            for (i = 0; i < board.length; i++) {
                if (board[i][i] == 1) {
                    num1++;
                }
                if (board[i][2 - i] == 1) {
                    num2++;
                }
            }
            if (num1 == 3 || num2 == 3) {
                System.out.println("玩家1 win!");
//			GotResult = true;
            } else if (num2 == 0 || num1 == 0) {
                System.out.println("玩家2 win!");
//			GotResult = true;
            } else {
                System.out.println("Draw!");
            }

        }
    }
}
