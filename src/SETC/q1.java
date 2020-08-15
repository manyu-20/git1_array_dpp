package SETC;

import java.util.Scanner;

public class q1 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        printPascal(x);
    }

    public static void printPascal(int x)
    {
        int[][] arr = new int[x][x];

        for (int line = 0; line < x; line++)
        {
            for (int i = 0; i <= line; i++)
            {
                if (line == i || i == 0)
                    arr[line][i] = 1;
                else
                    arr[line][i] = arr[line-1][i-1] + arr[line-1][i];
                System.out.print(arr[line][i]);
            }
            System.out.println("");
        }
    }
}
