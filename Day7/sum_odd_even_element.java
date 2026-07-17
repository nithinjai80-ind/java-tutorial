package Day7;
import java.util.*;
public class sum_odd_even_element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] a=new int[n];
        for(int i=0; i<n ;i++){
            a[i]=sc.nextInt();
        }
        int e=0;
        int o=0;
        for (int num:a){
           int b=str(num);
           if(b%2==0){
               e+=num;
           }
           else{
               o+=num;
           }
        }
        System.out.println("Even: "+e);
        System.out.println("Odd: "+o);
    }
    public static int str(int n){
        int c=0;
        while (n!=0){
            c+=n;
            n/=10;
        }
        return c;
    }
}
