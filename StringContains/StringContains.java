public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        if (s == null || subString == null) return true;
        return s.contains(subString);
    }
}