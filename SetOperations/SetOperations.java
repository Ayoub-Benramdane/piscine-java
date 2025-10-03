import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        for (Integer num : set2) {
            if (!unionSet.contains(num)) {
                unionSet.add(num);
            }
        }
        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<>();
        for (Integer num : set1) {
            if (set2.contains(num)) {
                intersectionSet.add(num);
            }
        }
        for (Integer num : set2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }
        return intersectionSet;
    }
}