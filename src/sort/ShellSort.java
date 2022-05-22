package sort;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(array));
        shellSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    private static void shellSort(int[] a, int n) {
        for(int h = n/2; h > 0; h/=2){
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for(j = i-h; j > 0 && a[j-1] < tmp; j-=h){
                    a[j+h] = a[j];
                }
                a[j+h] = tmp;
            }
        }
    }
}
