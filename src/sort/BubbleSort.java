package sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

    static void swap(int[] a, int idx1 , int idx2){
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    static void bubbleSort(int[] a, int n){
        int cnt = 0;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = n-1 ; j > i ; j--){
                if(a[j-1] > a[j]){
                    swap(a,j-1, j);
                }cnt++;
            }
        }
        System.out.println("비교횟수 : " + cnt);
    }

    public static void main(String[] args) {
        int[] array = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(array));
        bubbleSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}
