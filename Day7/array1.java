package Day7;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args){
        int [] a={1,2,3,4,5,6,7,8,9,10};
        int l=a.length;
        int s= Arrays.stream(a).sum();
        System.out.println(s);
        float b=(float) s/l;
        System.out.println(b);
    }
}
