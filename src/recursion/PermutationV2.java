package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        permutation(0);
    }

    private static char[] data = {'a','b','c','d'};
    private static int N = data.length;
    private static List<Character> include = new ArrayList<>();
    static void permutation(int k){
        if(k>=N){
            System.out.println(include);
        }
        for (int i = 0; i < N; i++) {
            include.add(data[i]);
            permutation(k+1);
            include.remove(data[i]);
            
        }
    }
}
