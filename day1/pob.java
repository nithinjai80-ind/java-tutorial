package day1;

import java.util.Scanner;

public class pob {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter no of duck:");
        int d= sc.nextInt();
        System.out.printf("Enter of min:");
        int m= sc.nextInt();
        float n=m/5;
        System.out.println(n*d);
    }
}
