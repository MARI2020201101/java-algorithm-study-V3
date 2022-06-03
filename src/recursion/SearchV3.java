package recursion;

public class SearchV2 {

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5};
        System.out.println(search(data, 0, data.length-1,4));
    }
    static int search(int[] data, int begin, int end, int target ){
        if(begin>=end){
            return -1;
        }else if(target==data[end]){
            return end;
        }else{
            return search(data, begin, end-1, target);
        }
    }
}
