public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(s);
        System.out.println(reversed);
        return reversed.toUpperCase() == s.toUpperCase(null);
    }
}