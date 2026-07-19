package Day8;

public class searching_2 {
    public static void main(String[] args){
        int [][] a={{1,2,3},{4,5,6},{7,8,9}};
        int t=9;
        if(ls(a,t)){
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }
    }
    public static boolean ls(int [][] arr,int teg){
        for (int i=0; i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if(teg==arr[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
