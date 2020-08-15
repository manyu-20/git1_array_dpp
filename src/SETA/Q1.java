package SETA;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of the array: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(max(arr));
        System.out.println(min(arr));
        int diff = max(arr) - min(arr);
        System.out.println("difference is "+diff);

    }
    static int min(int[] arr){
        int min = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(min>=arr[i])min = arr[i];
        }
        return min;
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(max<=arr[i])max = arr[i];
        }
        return max;
    }
}
