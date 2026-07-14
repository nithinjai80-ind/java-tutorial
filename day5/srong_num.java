package day5;
import java.util.*;
public class srong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(str(n)){
            System.out.println(n+" It is strong");
        }
        else{
            System.out.println(n+" It is not a strong");
        }
    }
    public static boolean str(int num){
        int s=0;
        int temp=num;
        while (num!=0){
            int pop=num%10;
            s+=fact(pop);
            num=num/10;
        }
        return s==temp;
    }
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n ; i++){
            f=f*i;
        }
        return f;
    }
}
