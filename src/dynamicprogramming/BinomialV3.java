package dynamicprogramming;

public class BinomialV2 {
    public static void main(String[] args) {
        System.out.println(binomial(4,2));

        for (int i = 0; i < cache.length; i++) {
            for (int j = 0; j < cache[0].length; j++) {
                System.out.print(cache[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] cache = new int[10][10];
    static int binomial(int n, int k){
        if(n == k || k ==0) return 1;
        else if(cache[n][k]!=0){
            return cache[n][k];
        }
        else{
            cache[n][k] = binomial(n-1,k) + binomial(n-1, k-1);
            return cache[n][k];
        }
    }
}
