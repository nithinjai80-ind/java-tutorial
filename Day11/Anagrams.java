package Day11;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args){
        System.out.println("The give strings aer anagrams :"+areAn("listen","silent"));
        System.out.println("The give strings aer anagrams :"+areAn("hello","world"));
    }
    public static boolean areAn(String s,String s2){
        if(s.length()!=s2.length()){
            return false;
        }
        char [] c=s.toCharArray();
        char [] c2=s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c2);
        return Arrays.equals(c,c2);
    }
}
