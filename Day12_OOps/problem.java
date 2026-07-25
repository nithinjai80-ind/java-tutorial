package Day12_OOps;
class N{
    int Rev(int n){
        int re=0;
        while (n!=0){
            int pop=n%10;
            re=re*10+pop;
            n/=10;
        }
        return re;
    }
}
public class problem {
    public static void main(String[] args){
        N dd=new N();
        int s= dd.Rev(123);
        System.out.println(s);
    }
}
