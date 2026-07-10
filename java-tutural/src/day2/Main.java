package day2;
import java.util.*;
public class Main{
    public static void main(String[] args){

       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("Add "+ (a+b));
       System.out.println("Mult: "+ a*b);
       System.out.println("Sub:"+ (a-b));
       System.out.println("Dvid:"+ (a/b) );
       System.out.println("increment a: "+ ++a);
       System.out.println("decrment a: "+ --a);

    }
}