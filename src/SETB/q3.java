package SETB;

import java.util.Arrays;
import java.util.Scanner;

//median of an array
public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size:");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("median: ");
        System.out.println(median(arr));
    }
    static int median(int[] arr){
        Arrays.sort(arr);
        if(arr.length%2==0){
            return ((arr[arr.length/2])+((arr.length/2)+1))/2;
        }
        else{
            return arr[arr.length/2];
        }
    }
}
