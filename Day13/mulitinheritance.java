package Day13;
//Muliti inheritance
class  F{
    void display(){
        System.out.print("Hello  ");
    }
}
class H extends F{
    void Show(){
        System.out.println("Java");
    }
}
class J extends F{
    void hi(){
        System.out.println("Bee.....");
    }
}
public class mulitinheritance  {
    public static void main(String[] args){
        H b=new H();
        b.display();
        b.Show();
        J c=new J();
        c.display();
        c.hi();
    }
}