package Day14;
abstract class empl{
    protected  String name;
    protected  int id;
    protected  int basesalary;
    empl(String name,int id,int salary){
        this.id=id;
        this.name=name;
        this.basesalary=salary;
    }
    abstract void bonus();
    void display(){
        System.out.println("Name "+name+" ID "+id);
    }
}
class manger extends empl{
    manger(String name,int id,int salary){
        super(name,id,salary);
    }
    void bonus(){
        System.out.println(basesalary+basesalary*0.10);
    }
}
class developer extends empl{
    developer(String name,int id,int salary){
        super(name,id,salary);
    }
    void bonus(){
        System.out.println(basesalary+basesalary*0.05);
    }
}
class intern extends empl{
    intern(String name,int id,int salary){
        super(name,id,salary);
    }
    void bonus(){
        System.out.println(basesalary*1);
    }
}
public class Empoylee {
    public static void main(String[] args){
        empl m=new manger("sam",103,1990);
        empl n=new developer("Sabir",123,12330);
        empl o=new intern("Kumar",122,900);
       m.display();
       m.bonus();
       n.display();
       n.bonus();
       o.display();
       o.bonus();
    }
}
