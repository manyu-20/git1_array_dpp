package SETA;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        int siz = s.nextInt();
        int[] arr = new int[siz];
        System.out.println("enter the elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("enter the number for frequency check");
        int num = s.nextInt();
        frequency(arr,num);

    }
    static void frequency(int[] arr,int num){
        int freq = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == num){
                freq++;
            }
        }
        System.out.println("frequency is "+ freq);
    }
}
