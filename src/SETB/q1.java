package SETB;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        int size = s.nextInt();
        int [] arr =new int[size];
        System.out.println("enter the elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        int[] ans = counter6(arr);
        System.out.println("occ of 6: "+ ans[0]);
        System.out.println("occ of 7 after 6: "+ans[1]);
    }
    static int[] counter6(int[] arr){
        int temp ;
        int[] occ = new int[2];
        for(int i = arr.length-1;i>0;i--){
            temp = arr[i-1];
            if(arr[i] == 6 && temp ==6){
                occ[0]++;
            }
            else if(arr[i]==7 && temp == 6){
                occ[1]++;
            }
        }
        return occ;
    }
}
