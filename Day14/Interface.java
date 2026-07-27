package Day14;
interface A{
    void a();
}
interface B extends A{
    void display();
}
class c implements B{
    public void a(){
        System.out.println("A");
    }
    public void display(){
        System.out.println("Display");
    }
}
public class Interface {
    public static void main(String[] args){
        B a=new c();
        a.a();
        a.display();
    }
}
