package Day3;
import java.util.*;
public class calc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the operator:");
        char op=sc.next().charAt(0);
        System.out.print("Enter first number :");
        int n= sc.nextInt();
        System.out.print("Enter sec number:");
        int m= sc.nextInt();
        switch (op){
            case '+':
                System.out.println(n+m);
                break;
            case '-':
                System.out.println( n-m);
                break;
            case '*':
                System.out.println( n*m);
                break;
            case '/':
                System.out.println( n/m);
                break;
            case '%':
                System.out.println( n%m);
                break;
            default:
                System.out.println("Invalid input");
        }

        //vowel
        System.out.print("Enter the letter between 65 to 90 and 97 to 122:");
        int v=sc.nextInt();
        char f=(char)v;
        switch (f){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            case 'A':
                System.out.println("vowel");
                break;
            case 'E':
                System.out.println("vowel");
                break;
            case 'I':
                System.out.println("vowel");
                break;
            case 'O':
                System.out.println("vowel");
                break;
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("it is consonant");
        }
    }
}
