import java.util.regex.*;

public class RegexReplace {

    public static String removeUnits(String s) {
        return s.replaceAll("(\\d+)(cm|€)(?!\\s|\\w|²)", "$1")
                .replaceAll("(\\d+)(cm|€)(?=\\s|$)", "$1");
    }

    public static String obfuscateEmail(String s) {
        Matcher m = Pattern.compile("([\\w._-]+)@([\\w.-]+)").matcher(s);
        StringBuffer result = new StringBuffer();

        while (m.find()) {
            String username = m.group(1);
            String domain = m.group(2);
            String newUser;

            if (username.contains(".") || username.contains("-") || username.contains("_")) {
                int firstSep = username.length();
                for (char c : new char[]{'.', '-', '_'}) {
                    int idx = username.indexOf(c);
                    if (idx != -1 && idx < firstSep)
                        firstSep = idx;
                }
                newUser = username.substring(0, firstSep + 1) + "*";
            } else if (username.length() > 3) {
                newUser = username.substring(0, 3) + "***";
            } else {
                newUser = username;
            }

            String[] parts = domain.split("\\.");
            String newDomain;

            if (parts.length == 3) { 
                newDomain = "*******." + parts[1] + ".***";
            } else if (parts.length == 2) {
                if (parts[1].matches("com|org|net")) {
                    newDomain = "*******." + parts[1];
                } else {
                    newDomain = "*******.**";
                }
            } else {
                newDomain = "*******." + parts[parts.length - 1];
            }

            m.appendReplacement(result, newUser + "@" + newDomain);
        }

        m.appendTail(result);
        return result.toString();
    }
}
