package day5;
import java.util.*;
public class remove_all_zero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int z=0;
        while(n!=0){
            int pop=n%10;
            if(pop!=0){
                z=z*10+pop;
            }
            n/=10;
        }
        int a=0;
        while (z!=0){
            int pop=z%10;
            a=a*10+pop;
            z/=10;
        }
        System.out.println(a);
    }
}
