package dynamicprogramming;

public class ShortestPath {

    public static void main(String[] args) {

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
    private static int total = Integer.MAX_VALUE;
    private static int tmp = Integer.MAX_VALUE;
    private static int[][] sum = new int[4][4];

    private static int shortestPath(int n, int k){
        for (int i = 0; i < PATH.length; i++) {
            sum[i][0]=PATH[i][0];
            sum[0][i]=PATH[0][i];
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum[i][j] = Math.min(sum[i-1][j],  sum[i][j-1]);
            }
        }

        return sum[n][k] ;

    }
}
