import java.util.ArrayList;
import java.util.List;

public class CleanExtract {
    public static String extract(String s) {
        if (s == null) return "";
        String[] words = s.split(" ");
        List<String> res = new ArrayList<>();
        boolean in = false;
        int count = 0;
        for (String word : words) {
            count++;
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
                if (count != words.length - 1) {
                    res.add(newWord.replace(".", ""));
                } else {
                    res.add(newWord);
                }
            }
        }
        String last = String.join(" ", res);
        if (last.contains(".")) {
            return last;
        } else if (last == null) {
            return "";
        }
        return last.trim() + " .";
    }
}