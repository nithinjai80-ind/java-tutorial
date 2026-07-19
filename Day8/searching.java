package Day8;
import java.util.*;
public class searching {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] a=new int[n];
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int t= sc.nextInt();
        System.out.println(ls(a,t));
    }
    public static int ls(int []arr,int n){
        for (int i=0; i<arr.length; i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}
