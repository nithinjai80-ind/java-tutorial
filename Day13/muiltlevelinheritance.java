package Day13;
class D {
    void display(){
        System.out.print("Hello  ");
    }
}
class E extends D{
    void Show(){
        System.out.println("Java");
    }
}
class C extends B{
    void hi(){
        System.out.println("Bee.....");
    }
}
public class muiltlevelinheritance  {
    public static void main(String[] args){
        B b=new B();
        b.display();
        b.Show();
        C c=new C();
        c.display();
        c.hi();
        c.Show();
        c.display();
    }
}
