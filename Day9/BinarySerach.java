package Day9;

public class BinarySerach {
    public static void main(String[] args){
        int []a={1,2,3,4,5};
        int t=5;
        System.out.println(binarySearch(a,t));
    }
    public static int binarySearch(int [] ar,int te){
        int s=0;
        int e=ar.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]>te){
                e=mid-1;
            } else if (ar[mid]<te) {
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
