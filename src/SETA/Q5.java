package SETA;

import java.util.Scanner;

public class Q5 {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter the elements in the array");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                int num = s.nextInt();
                if(String.valueOf(num).length()>=2){
                    j--;
                    System.out.println("re enter the number");
                }
                else if(num%2==0){
                    j--;
                    System.out.println("re enter the number");

                }
                else{
                    arr[i][j] = num;
                }
            }
        }
    }
    static  void print(int[][] arr,int row,int col){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void print2(int[][] arr,int row,int col){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                int num = arr[i][j];
                if(num %2!=0){
                    System.out.println(arr[i][j]*2+" ");
                }
            }
            System.out.println();
        }
    }
}
