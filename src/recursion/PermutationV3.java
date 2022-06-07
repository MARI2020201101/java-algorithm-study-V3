package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationV2 {
    public static void main(String[] args) {
        permutation(0);
    }

    private static char[] data = {'a','b','c','d'};
    private static int N = data.length;

    static void permutation(int k){
        if(k==N){
            System.out.println(data);
            return;
        }
        for (int i = 0; i < N; i++) {
            swap(data, k, i);
            permutation(k+1);
        }
    }

    private static void swap(char[] data, int k, int i) {
        char tmp = data[i];
        data[i] = data[k];
        data[k] = tmp;
    }
}
