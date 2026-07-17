package Day7;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int c :arr){
            if(max< c){
                max= c;
            }
            if(min>c){
                min= c;
            }
        }
        System.out.println("Max"+max);
        System.out.println("Min"+min);
    }
}
