import java.util.ArrayList;
import java.util.List;

public class CleanExtract {
    public static String extract(String s) {
        String[] words = s.split(" ");
        List<String> res = new ArrayList<>();
        boolean in = false;
        for (String word : words) {
            if (word == "") {
                continue;
            }
            if (word.contains("|")) {
                in = true;
            }
            if (in && word.contains(".")) {
                in = false;
            }
            if (!in) {
                String newWord = word.replace("|", "");
                if (newWord.replace(".", "") == "") continue;
                res.add(newWord.replace(".", ""));
            }
        }
        return String.join(" ", res);
    }
}