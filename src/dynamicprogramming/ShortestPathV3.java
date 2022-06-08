package dynamicprogramming;

public class ShortestPathV2 {

    public static void main(String[] args) {
        for (int i = 0; i < PATH.length; i++) {
            sum[i][0]=PATH[i][0];
            sum[0][i]=PATH[0][i];
        }
//        sum[0][0] = PATH[0][0];
//        sum[1][0] = PATH[1][0];
//        sum[0][1] = PATH[0][1];
        System.out.println(shortestPath(3,3));
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int[][] PATH = {
            {6,7,12,5},
            {5,3,11,18},
            {7,17,3,3},
            {8,10,14,9}
    };

    private static int[][] sum = new int[4][4];

    private static int shortestPath(int n, int k){

        if(sum[n][k]!=0){
            return sum[n][k];
        }
        else {
          sum[n][k] = Math.min(shortestPath(n-1,k), shortestPath(n,k-1)) + PATH[n][k];
          return sum[n][k];
        }

    }
}
