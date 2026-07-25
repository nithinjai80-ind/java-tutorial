package Day13;
class V{
    private int a;
    private int b;
    private String str;
    void setId(int a,int b,String str){
        this.a=a;
        this.b=b;
        this.str=str;
    }
    int getA(){
        return this.a;
    }
    int getB(){
        return this.b;
    }
    String getStr(){
        return this.str;
    }
}
public class Setter_getter {
    public static void main(String[] args){
        V a=new V();
        a.setId(1000,233,"Nithinjai");
        System.out.println(a.getA());
        System.out.println(a.getB());
        System.out.println(a.getStr());
    }
}
