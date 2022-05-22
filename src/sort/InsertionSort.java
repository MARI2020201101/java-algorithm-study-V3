package sort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(array));
        insertionSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];
            System.out.println("tmp : "+tmp);
            for (j = i; j > 0 && a[j-1] > tmp ; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
            System.out.println(Arrays.toString(a));
            System.out.println();
        }
    }
}
