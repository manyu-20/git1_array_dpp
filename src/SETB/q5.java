package SETB;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("enter the size: ");
        int size = s.nextInt();
        String[] st= new String[size];
        System.out.println("enter the elements");
        for (int i =0; i<st.length;i++){
            st[i]  =s.next();
        }
        palindrome(st);
    }
    static void palindrome(String[] st){
        boolean flag = true;
        for(int i = 0;i<st.length;i++){
            int index = st.length - 1 - i;
            if(!st[i].equals(st[index])){
                flag = false;
            }
        }
        if(flag) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
