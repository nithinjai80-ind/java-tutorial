package Day7;
import java.util.*;
public class array_2d {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row :");
        int row= sc.nextInt();
        System.out.print("Enter col :");
        int col= sc.nextInt();
        int [][] a=new int[row][col];
        int [][] b=new int[row][col];
        int [][] sum=new int[row][col];
        System.out.println("Enter first matrix");
        for(int i=0; i<row ;i++){
            for(int j=0; j<col; j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter second matrix");
        for(int i=0; i<row ;i++){
            for(int j=0; j<col; j++){
                b[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<row ;i++){
            for(int j=0; j<col; j++){
                sum[i][j]= a[i][j]+b[i][j];
            }
        }
        System.out.println("The sum of two matrix");
        for(int i=0; i<row ;i++){
            for(int j=0; j<col; j++){
                System.out.printf("%4d",sum[i][j]);
            }
            System.out.println();
        }
    }
}
