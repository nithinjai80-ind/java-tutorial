package Day10;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String srr=str;
        char [] chars=str.toCharArray();
        int s=0,e=chars.length-1;
        while (s<=e){
            char temp=chars[s];
            chars[s]=chars[e];
            chars[e]=temp;
            s++;
            e--;
        }
        String r=new String(chars);
       if(srr.equals(r)){
           System.out.println("It is palindrom");
       }
       else{
           System.out.println("It is not a palindrom");
       }
    }
}
