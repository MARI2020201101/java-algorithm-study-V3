package dynamicprogramming;

public class Binomial {
    public static void main(String[] args) {
        System.out.println(binomial(4,2));
    }
    static int binomial(int n, int k){
        if(n == k || k ==0) return 1;
        else{
            return binomial(n-1,k) + binomial(n-1, k-1);
        }
    }
}
