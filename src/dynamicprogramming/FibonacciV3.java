package dynamicprogramming;

import java.util.Arrays;

public class FibonacciV2 {
    public static void main(String[] args) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -1;
        }
        System.out.println(fib(6));
        System.out.println(Arrays.toString(nums));
    }
    private static int[] nums = new int[10];
    private static int fib(int n){
        if(n < 2) {
            nums[n] = 1;
            return 1;
        }
        else if(nums[n]!=-1){
            return nums[n];
        }
        else{
            nums[n] = fib(n-1)+fib(n-2);
            return nums[n];
        }
    }
}
