package Day8;

public class min_short {
    public static void main(String[] args) {
        int[] a = {1, 3,2,4,7,9,2};
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
