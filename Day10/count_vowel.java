package Day10;
import java.util.Scanner;
public class count_vowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str.toLowerCase();
        char [] chars=str.toCharArray();
        int v=0;
        int c=0;
       for(char s:chars){
           if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
               v++;
           }
           else if(s=='b'||s=='c'||s=='d'|| s=='f'|| s=='g'||s=='h'||s=='j'||s=='k'||s=='l'||s=='m'||s=='n'||s=='p'||s=='r'||s=='s'||s=='t'||s=='v'||s=='w'||s=='x'||s=='y'||s=='z'||s=='q') {
               c++;
           }
       }
       System.out.println("Vowel:  "+v+" consonant: " +c);
    }
}
