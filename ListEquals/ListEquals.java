import java.util.List;

public class ListEquals {
    public static boolean areListsEqual(List<String> list1, List<String> list2) {
        System.out.println(list1);
        System.out.println(list2);
        if (list1 == null || list2 == null) {
            System.out.println("w7da null");
            return false;
        } else if (list1 == null && list2 == null) {
            System.out.println("bjouj null");
            return true;
        }
        return list1.equals(list2);
    }
}