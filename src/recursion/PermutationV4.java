package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationV3 {
    public static void main(String[] args) {
        permutation(0);
    }

    private static char[] data = {'a','b','c','d'};

    private static int N = data.length;
    private static int[] perm = new int[N];

    private static List<Character> include = new ArrayList<>();
    static void permutation(int k){
        if(k==N){
            System.out.println(include);
            include.clear();
            return;
        }
        for (int i = 0; i < N; i++) {
            char tmp = data[k];
            include.add(tmp);
            permutation(k+1);
        }
    }

}
