package Day11;

import java.util.Scanner;

public class longest_word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] c=str.split(" ");
        String max=c[0];
        for(String s:c){
            if(max.length()<s.length()){
               max=s;
            }
        }
        System.out.println(max);
    }
}
