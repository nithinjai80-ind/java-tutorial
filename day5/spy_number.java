package day5;
import java.util.*;
public class spy_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();
        int sum=0;
        int p=1;
        while (s!=0) {
            int pop=s%10;
            sum+=pop;
            p*=pop;
            s/=10;
        }
        if(sum==p){
            System.out.println("It is spy number");
        }
        else{
            System.out.println("It is not a spy number");
        }
    }
}
