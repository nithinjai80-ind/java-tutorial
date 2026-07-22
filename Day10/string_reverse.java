package Day10;
import java.util.*;
public class string_reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
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
        System.out.println(r);
    }
}
