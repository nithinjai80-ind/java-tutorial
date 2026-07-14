package Day4;
import java.util.*;
public class check_if_numder_contain_zero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int sum=0;
        while(a!=0) {
            int pop = a % 10;
            a /= 10;
            if (pop == 0) {
                sum++;
            }
        }
        System.out.println("The number of 0's:"+sum);
        if(sum==0){
            System.out.println("The number contain does't zero");
        }
        else {
            System.out.println("The number contain zero");
        }
    }
}
