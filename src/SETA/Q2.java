package SETA;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        String st;
        do {
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(100);
            }
            System.out.println("all the elements are:");
            printall(arr);
            System.out.println();
            System.out.println("Every element at an even index");
            evenIndex(arr);
            System.out.println();
            System.out.println("Every odd element");
            oddElement(arr);
            System.out.println();
            System.out.println("All elements in reverse order");
            revElement(arr);
            System.out.println();
            firstAndLast(arr);
            st = s.nextLine();
        }
        while (st.equals("Y"));



    }
    static void evenIndex(int[] arr){
        for(int i = 0;i<arr.length;i=i+2){
            if(i>arr.length-1)break;
            else{
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void printall(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void oddElement(int[] arr){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void revElement(int[] arr){
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    static void firstAndLast(int[] arr){
        System.out.println("first element is "+arr[0]);
        System.out.println("last element is "+arr[arr.length-1]);
    }
}
