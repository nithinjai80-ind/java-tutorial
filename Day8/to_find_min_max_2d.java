package Day8;

public class to_find_min_max_2d {
    public static void main(String[] args){
        int [][]a={{1,2},{4,5}};
        int m=max(a);
        int n=min(a);
        System.out.println("Max: "+m);
        System.out.println("Min: "+n);
    }
    public static int max(int [][] arr){
        int max=arr[0][0];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    public static int min(int [][] arr){
        int min =arr[0][0];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
}
