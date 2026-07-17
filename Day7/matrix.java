package Day7;
import java.util.Scanner;
public class matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row :");
        int row= sc.nextInt();
        System.out.print("Enter col :");
        int col= sc.nextInt();
        int [][] a=new int[row][col];
        int [][] sum=new int[col][row];
        System.out.println("Enter first matrix");
        for(int i=0; i<row ;i++){
            for(int j=0; j<col; j++){
                a[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<row ;i++){
            for(int j=0; j<col; j++){
                sum[j][i]= a[i][j];
            }
        }
        System.out.println("The result:");
        for(int i=0; i<col ;i++){
            for(int j=0; j<row; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
