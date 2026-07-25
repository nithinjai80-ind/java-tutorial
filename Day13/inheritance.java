//Single Inneritance
package Day13;
class  A{
    void display(){
        System.out.print("Hello  ");
    }
}
class B extends A{
    void Show(){
        System.out.println("Java");
    }
}
public class inheritance {
    public static void main(String[] args){
        B b=new B();
        b.display();
        b.Show();
    }
}