package dsa;

import java.util.Scanner;
import java.util.*;
public class initial {
    
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int c=0;
     while(n!=0){
        int d=n%10;//2
        System.out.println(d);
        c++;//3
        n=n/10;//0
     }
     System.out.println(c);
    }
}
