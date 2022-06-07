package recursion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PowerSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        powerSet(set,0);
    }
    private static int size = 5;

    static void powerSet(Set<String> set, int n){
        if(n>=size){
            return;
        }

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            Set<String> subSet = new HashSet<>();
            subSet.addAll(set);
            subSet.remove(next);
            if(!subSet.isEmpty()){
                System.out.println(subSet);
            }
            powerSet(subSet, n+1);

        }

    }
}
