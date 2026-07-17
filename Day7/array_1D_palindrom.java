package Day7;
import java.util.*;
public class array_1D_palindrom {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the array:");
        int n= sc.nextInt();
        int [] a=new int[n];
        System.out.print("Enter the array:");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        boolean b=true;
        for(int i=0; i<n%2;i++){
            for (int j=n%2-1;j>0;j--){
                if (a[i]!=a[j]){
                    b=false;
                }
            }
        }
        System.out.println("The given array is a palindrom "+b);
    }
}
