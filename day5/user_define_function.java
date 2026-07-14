package day5;
import java.util.Scanner;
public class user_define_function {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=add(a,b);
        System.out.println(c);
        add1();
        add2(a,b);
        int d=add3();
        System.out.println(d);

    }
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static void add1(){
        System.out.println("Hello");
    }
    public static void add2(int a,int b){
        System.out.println(a+b);
    }
    public static int add3(){
        return 11;
    }
}
