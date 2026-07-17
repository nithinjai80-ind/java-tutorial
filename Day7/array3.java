package Day7;
public class array3 {
    public static void main(String[] args){
        int [] a={1,2,3,4,5,6,7,8,9};
        int [] b=new int[9];
        for(int i=0; i<9; i++){
            int f=a[i];
            int l=a[8-i];
            b[i]=l;
            b[8-i]=f;
        }
        for (int e: b){
            System.out.print(e);
        }
    }
}