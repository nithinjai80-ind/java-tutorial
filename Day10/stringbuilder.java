package Day10;

public class stringbuilder {
    public static void main(String[] args){
        StringBuilder s=new StringBuilder("hello ");
        s.append("world");
//        s.insert(2,200);
        s.replace(0,9,"hello guys");
        System.out.print(s);

    }
}
