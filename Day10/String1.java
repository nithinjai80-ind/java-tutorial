package Day10;

public class String1 {
    public static void main(String[] args){
        String n="Hello";
        String m="Hello";
        System.out.println(n==m);
        String s=new String("Hello");
        String s1=new String("Hello");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        char []chars={'H','e','l','l','o'};
        String str=new String(chars);
        System.out.println(str);

        StringBuilder s2=new StringBuilder("Hello");
        StringBuilder s3=new StringBuilder("Hello");
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));

        String ss= s2.toString();
        String ss1= s3.toString();
        System.out.println(ss==ss1);
        System.out.println(ss.equals(ss1));

        System.out.println("Hello".equalsIgnoreCase("hElLO"));
        System.out.println("length "+s2.length());

        System.out.println(s+" "+s.toLowerCase());
        System.out.println(s.trim());

        System.out.println(s.replace('e','l'));
        System.out.println(ss.replaceAll("Hello","hi"));

        String St="hello world";
        System.out.println(St.replaceFirst("hello","hi"));
        System.out.println(St.contains("e"));

        String []a=St.split(" ");
        for(String num:a){
            System.out.print(num+ ", ");
        }
    }
}
