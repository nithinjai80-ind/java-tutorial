package Day13;

import java.lang.classfile.Superclass;

class animal{
    void sound(){
        System.out.println("A animal made a sound");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("Bark");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("meow");
    }
}
class a extends animal{
}
public class overreading {
    public static void main(String[] args){
        cat c=new cat();
        c.sound();
        dog d=new dog();
        d.sound();
        a o=new a();
        o.sound();
    }
}
