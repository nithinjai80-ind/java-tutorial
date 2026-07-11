package Day3;
import java.util.*;
public class condition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first number:");
        int a= sc.nextInt();
        System.out.print("Enter a second number");
        int b= sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        //to find a number is div of two number
        if(a%5==0){
            if(a%3==0){
                System.out.println("the is div by 3 and 5");
            }
            else {
                System.out.println("The is div only 5");
            }
        }


        //Ternary operator
        int age=20;
        String status=(age>=18)? "Adult":"Minor";
        System.out.println(status);



        //Switch case
            System.out.print("Enter the no day 1 to 7:");
            int d= sc.nextInt();
            switch (d){
                    case 1:
                            System.out.println("Sunday");
                            break;
                    case 2:
                            System.out.println("Monday");
                            break;
                    case 3:
                            System.out.println("Tuesday");
                            break;
                    case 4:
                            System.out.println("Wednesday");
                            break;
                    case 5:
                            System.out.println("Thursday");
                            break;
                    case 6:
                            System.out.println("Friday");
                            break;
                    case 7:
                            System.out.println("Saturday");
                            break;
                    default:
                            System.out.println("Invalid input");
            }

    }
}
