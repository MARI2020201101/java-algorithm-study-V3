package recursion;

public class FindMax {

    public static void main(String[] args) {
        int[] data = {1,3,5,3,4};
        System.out.println(findMax(data, 0,data.length-1));
    }
    static int findMax(int[] data, int begin, int end){
        if(begin==end){
            return data[begin];
        }else{
            return Math.max(data[begin], findMax(data, begin+1, end));
        }
    }
}
