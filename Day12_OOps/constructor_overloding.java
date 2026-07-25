package Day12_OOps;
class A{
    int age;
    int id;
    String name;
    A(int age){
        this.age=age;
        System.out.println(age);
    }
    A(int a,String name,int id){
        this.age=a;
        this.name=name;
        this.id=id;
        System.out.println(age+" "+name+" "+id);
    }
}
public class constructor_overloding {
    public static void main(String[] args){
        A a=new A(10);
        A b=new A(12,"Hello",2003);
    }
}
