package Day12_OOps;
class car {
    private String m;
    private int y;

    car(String m, int y) {
        this.m = m;
        this.y = y;
    }

    void display() {
        System.out.println(m + " " + y);
    }
}
public class constructor {
    public static void main(String[] args){
        car n=new car("Hello",1039);
        n.display();
    }
}
