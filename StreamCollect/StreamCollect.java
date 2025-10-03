import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        Map<Character, List<String>> map = s.collect(Collectors.groupingBy(word -> Character.toUpperCase(word.charAt(0))));;
        return map;
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
            return s.collect(Collectors.groupingBy( n -> n % 4, Collectors.maxBy(Comparator.naturalOrder()) ));
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
         List<String> sorted = s.sorted().collect(Collectors.toList());
         return "{" + String.join(" # ", sorted) + "}";
    }
}