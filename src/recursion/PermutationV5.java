package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationV4 {
    public static void main(String[] args) {
        permutation(0,0);
    }

    private static char[] data = {'a','b','c','d'};
    private static int N = data.length;
    private static int[] perm = new int[N];

    static void permutation(int j, int k){
        if(k==N){
            for (int i = 0; i < N; i++) {
                System.out.print(data[perm[i]]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
                perm[j]=i;
                permutation(j+1,k+1);
        }
    }

}
