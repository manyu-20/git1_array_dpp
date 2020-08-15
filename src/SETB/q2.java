package SETB;

import java.util.Scanner;

//swapping adjacent elements
public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size:");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("swapped:-");
        swap(arr);
    }
    static void swap(int[] arr){
        int count = 0;
        for(int i = 0;i<arr.length;i=i+2){
            if(count == arr.length-1 && count%2==0)break;
            if(i>=arr.length-1)break;
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
            count++;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
