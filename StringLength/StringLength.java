public class StringLength {
    public static int getStringLength(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        return s.length();
    }
}