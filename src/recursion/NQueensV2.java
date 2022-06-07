package recursion;

import java.util.HashSet;
import java.util.Set;

public class NQueens {
    public static void main(String[] args) {
        nQueens(0);
    }

    private static int N = 8;

    private static int SET = 1;
    private static int[][] CHESS = {
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}
    };

    private static Set<Integer> setted = new HashSet<>();

    static void nQueens(int p){
        if(p>=N){
            printChess();
            return;
        }

        for(int i = 0; i < N ; i++){
            if(! setted.contains(i)){
                CHESS[p][i]=SET;
                setted.add(i);
                nQueens(p+1);
            }
        }
    }

    private static void printChess() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(CHESS[i][j]+" ");
            }
            System.out.println();
        }
    }

}
