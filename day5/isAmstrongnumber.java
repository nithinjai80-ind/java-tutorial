package day5;
import java.util.*;
public class isAmstrongnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int o=n;
        int s=0;
        while (n!=0){
            int pop=n%10;
            s+=pop*pop*pop;
            n/=10;
        }
        if(o==s){
            System.out.println("is a Amstrong number");
        }
        else{
            System.out.println("not a Amstrong number");
        }
    }
}
