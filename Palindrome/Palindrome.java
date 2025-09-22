public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed.toUpperCase() == s.toUpperCase(null);
    }
}