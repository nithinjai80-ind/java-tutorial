package Day7;
import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char [] b=new char[5];
        for(int i=0; i<5; i++){
            char a=sc.nextLine().charAt(0);
            b[i]=a;
        }
        for(char num:b){
            System.out.print(" " +num);
        }
    }
}
