package Day7;

public class sum_even_odd {
    public static void main(String[] args){
        int []a={1,2,3,4,5,6,7,8,9};
        int o=0;
        int e=0;
        for(int i=0; i<9; i++){
            if(a[i]%2==0){
                e+=a[i];
            }
            else {
                o+=a[i];
            }
        }
        System.out.println("Even:"+e);
        System.out.println("Odd:"+o);
    }
}
