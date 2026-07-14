package Day4;
import java.util.*;
public class to_find_freqance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int c = sc.nextInt();
        System.out.print("the a number");
        int f= sc.nextInt();
        int sum=0;
        while (c!=0){
            int pop=c%10;
            c/=10;
            if(pop==f){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
