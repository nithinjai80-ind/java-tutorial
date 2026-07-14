package day5;
import java.util.*;
public class find_small_digit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int s=9;
        while (n!=0){
            int pop=n%10;
            if(s>pop){
                s=pop;
            }
            n/=10;
        }
        System.out.println("The least number :"+s);
    }
}
