package Day4;
import java.util.Scanner;
import java.util.Random;
public class do_while {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int key=r.nextInt(100);
        int g;
        do{
            System.out.print("Enter your guess");
            g= sc.nextInt();
            if(g>key){
                System.out.println("guess is high");
            } else if (g<key) {
                System.out.println("guess is low");

            }
        }while (key!=g);
        System.out.println("you guessed it");
    }
}