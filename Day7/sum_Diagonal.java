package Day7;
import java.util.*;
public class sum_Diagonal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of matrix:");
        int n= sc.nextInt();
        int [][] a=new int[n][n];
        System.out.println("Enter matrix element:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]= sc.nextInt();
            }
        }
        int d=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][i]==a[i][j]){
                    d += a[i][j];
                }
            }
        }
        System.out.println(d);
    }
}
