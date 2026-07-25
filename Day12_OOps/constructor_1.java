package Day12_OOps;
class  a{
    int a;
    int b;
    String str;
    String s;
    a(int n){
        this.a=n;
    }
    void display(int n){
        System.out.println(n);
    }
    a(){

    }
    void display(){
        System.out.println("Hello");
    }
    a(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(int a,int b){
        System.out.println(a+" "+b);
    }
}
public class constructor_1 {
    public static void main(String[] args){
        a num=new a();
        num.display();
        num.display(4);
        num.display(3,5);
    }
}
