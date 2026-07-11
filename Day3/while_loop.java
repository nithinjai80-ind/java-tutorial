package Day3;
import java.util.*;
public class while_loop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        while (n!=0){
            int pop=n%10;
            n/=10;
            sum++;
        }
        System.out.println(sum);
    }
}
