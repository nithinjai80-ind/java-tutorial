package Day12_OOps;
class B{
    int age;
    int id;
    String name;
   B(int age){
       this.age=age;
       System.out.println(age);
    }
    B(int a,String name,int id){
        this.age=a;
        this.name=name;
        this.id=id;
        System.out.println(age+" "+name+" "+id);
    }
}
public class oops {
    public static void main(String[] args){
        B a=new B(9,"Sanjayraj",9999);

    }
}
