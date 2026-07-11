package Day3;

import java.util.Scanner;

public class num_crunching {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int rev=0;
        while (n!=0){
            int pop=n%10;
            rev=rev*10+pop;
            n/=10;
        }
        System.out.println(rev);
    }
}
