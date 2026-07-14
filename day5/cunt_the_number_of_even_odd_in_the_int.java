package day5;
import java.util.*;
public class cunt_the_number_of_even_odd_in_the_int {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();
        int s=0;
        int e=0;
        int o=0;
        while (n!=0){
            int pop=n%10;
            if(pop%2==0){
                e+=pop;
            }
            else {
                o+=pop;
            }
            s+=pop;
            n/=10;
        }
        System.out.println("Total sum of number: "+s);
        System.out.println("Total number of even: "+e);
        System.out.println("Total number of odd:"+o);
    }
}
