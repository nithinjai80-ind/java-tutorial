package Day13;
class student{
    public void display(){
        String name="Sabari";
        int id=202428;
        System.out.println("The Student name is : "+name);
        System.out.println("The Student ID is : "+id);
    }
}
class mentor extends student {
    private String name;
    private int id;
    void setId(String name,int id){
        this.name=name;
        this.id = id;
    }
    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }
}
class hod extends mentor{
    private String name;
    private int id;
    void setId(String name,int id){
        this.name=name;
        this.id = id;
    }
    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }
}
public class Student_management{
    public static void main(String[] args) {
        student s=new student();
        s.display();
        mentor m=new mentor();
        m.setId("Agilesh",2346);
        System.out.println("The Mentor name is : "+m.getName());
        System.out.println("The Mentor ID is : "+m.getId());
        hod h=new hod();
        h.setId("Nithin",2345);
        System.out.println("The hod name is : "+h.getName());
        System.out.println("The hod ID is : "+h.getId());
    }
}
