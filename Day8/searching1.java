package Day8;

public class searching1 {
    public static void main(String[] args){
        String str="Hello world";
        char [] n=str.toCharArray();
        char t=' ';
        if (ls(n,t)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not fount");
        }
    }
    public static boolean ls(char []name,char teg){
        for (char n:name){
            if(n==teg){
                return true;
            }
        }
        return false;
    }
}
