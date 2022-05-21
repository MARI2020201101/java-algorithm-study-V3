package sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(array));
        selectionSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if(a[j] < a[minIdx]){
                    minIdx = j;
                }
            }
            swap(a,i,minIdx);
        }

    }
}
