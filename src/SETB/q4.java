package SETB;

import java.util.ArrayList;
import java.util.Scanner;

public class q4 {
     static class Pairs{
         int x,y;
        Pairs(int X,int Y){
            int[] arr = new int[2];
            x = X;
            y = Y;
            arr[0] = x;
            arr[1] = y;
        }


    }
    static void print(Pairs p){
        System.out.println("( "+p.x+" , "+p.y+" )");
     }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of pairs list");
        int size = s.nextInt();
        Pairs[] p = new Pairs[size];
        System.out.println("enter the elements of "+size+" number of pairs");
        for(int i = 0;i<p.length;i++){
            System.out.println("enter x");
            int x = s.nextInt();
            System.out.println("enter y");
            int y = s.nextInt();
            p[i] = new Pairs(x,y);
        }
        System.out.println("*********");
        System.out.println("following pairs are: ");
        for(int i = 0;i<p.length;i++){
            print(p[i]);
        }
        sorted(p);



    }
    static void sorted(Pairs[] p){
         int temp;
         for(int i = 0;i<p.length;i++){
             if(p[i].x>p[i].y){
                 temp = p[i].x;
                 p[i].x = p[i].y;
                 p[i].y = temp;
             }
         }
        System.out.println("following sorted pairs are: ");
        for(int i = 0;i<p.length;i++){
            print(p[i]);
        }
    }
}
