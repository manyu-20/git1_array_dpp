package SETA;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the lemnets of the array: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }

        System.out.println("1.Sum of all the elements");
        System.out.println("2.Sum of alternate elements in the array");
        System.out.println("3.Second highest element in the array");
        int choice  = s.nextInt();
        switch (choice){
            case 1:
                System.out.println("sum of all elemnets");
                sum(arr);
                break;
            case 2:
                System.out.println("sum of alternate elemnets in the array");
                sumAl(arr);
                break;
            case 3:
                System.out.println("second highest");
                secondHigh(arr);
                break;
        }
    }
    static void sum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    static void sumAl(int[] arr){
        int sumAl = 0;
        int i = 0;
        while(i<arr.length){
            if(i>=arr.length)break;
            sumAl = sumAl +arr[i];
            i = i+2;
        }
        System.out.println(sumAl);
    }
    static void secondHigh(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sec highest "+arr[arr.length-2]);
    }
}
