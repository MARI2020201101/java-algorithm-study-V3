package sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortV3 {

    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    static void bubbleSort(int[] a, int n){
        int k = 0;
        while(k < n-1){
            int last= 0;
            for (int i = n-1; i > k ; i--) {
                if(a[i-1] > a[i]){
                    swap(a, i-1, i);
                }
                last = i;
            }
            k=last;
        }
    }

    public static void main(String[] args) {
        int[] array = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(array));
        bubbleSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
