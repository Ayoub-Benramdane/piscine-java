import java.util.ArrayList;
import java.util.List;

public class CleanExtract {
    public static String extract(String s) {
        if (s == null || s == "")
            return "";
        String[] words = s.split(" ");
        List<String> res = new ArrayList<>();
        boolean in = false;
        boolean no9ta = false;
        int count = 0;
        if (s.endsWith(".")) {
            no9ta = true;
        }
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
                    if (newWord.replace(".", "") != "") {
                        res.add(newWord.replace(".", ""));
                    }
                } else if (newWord != "") {
                    res.add(newWord);
                }
            }
        }
        String last = String.join(" ", res);
        if (last.contains(".")) {
            return last.trim();
        } else if (last == "" || last == null) {
            return "";
        }
        if (no9ta) {
            return last.trim() + " .";
        }
        return last.trim();
    }
}