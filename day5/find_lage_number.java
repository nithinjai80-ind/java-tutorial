package day5;
import java.util.*;
public class find_lage_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n= sc.nextInt();
        int l=0;
        while(n!=0){
            int pop=n%10;
            if(l<pop){
                l=pop;
            }
            n/=10;
        }
        System.out.println("The largest digit: "+l);
    }
}
