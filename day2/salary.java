package day2;
import java.util.*;
public class salary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //To find salary of a person for month and year
        System.out.printf("Enter one day salary:");
        int s= sc.nextInt();
        int c=s*31;
        System.out.println("Salary for month:"+ c );
        System.out.println("Salary for Year"+ c*12 );


        //To find temparture in c to f
        System.out.printf("Enter in temperature in c:");
        int t= sc.nextInt();
        int f=(t*9/5)+32;
        System.out.println("Temperature:"+f);


        //To find how many sec in a hour
        System.out.printf("Enter no of hour:");
        int h= sc.nextInt();
        int sec=h*3600;
        System.out.println("Hour to Sec:"+h+" to "+sec);



        //To get loan
        System.out.printf("Enter the amount:");
        int n= sc.nextInt();
        System.out.printf("Enter cible score:");
        int cr= sc.nextInt();
        System.out.println("loan granted true or flase:"+ (cr>750 && n>100000));


        //To find avg of 5 subject mark
        System.out.printf("Enter english mark:");
        int en= sc.nextInt();
        System.out.printf("Enter maths mark:");
        int mat= sc.nextInt();
        System.out.printf("Enter science mark:");
        int sci= sc.nextInt();
        System.out.printf("Enter Tamil mark:");
        int ta= sc.nextInt();
        System.out.printf("Enter computer mark:");
        int comp= sc.nextInt();
        int sum=ta+sci+en+mat+comp;
        float avg=sum/5;
        System.out.println("Average of 5 subject:"+avg);
    }
}
