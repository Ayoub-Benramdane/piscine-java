public class RegexReplace {
    public static String removeUnits(String s) {
        return s.replaceAll("([0-9]+)(cm|€)(\s|$)", "$1$3");
    }

    public static String obfuscateEmail(String email) {
        String emailPattern = "^([a-zA-Z0-9]+[\\._-]|[a-zA-Z0-9]{3,3})([a-zA-Z0-9]+)@([a-zA-Z]+)(\\.)(com|co|net|org)?(\\.)?(.*)?";

        String usernamePrefix = email.replaceAll(emailPattern, "$1");
        String usernameSuffix = email.replaceAll(emailPattern, "$2");

        String domainName = email.replaceAll(emailPattern, "$3");
        String firstDot = email.replaceAll(emailPattern, "$4");
        String topLevelDomain = email.replaceAll(emailPattern, "$5");

        String secondDot = email.replaceAll(emailPattern, "$6");
        String secondaryTLD = email.replaceAll(emailPattern, "$7");

        String obfuscatedUsernameSuffix = usernameSuffix.replaceAll(".", "*");
        String obfuscatedDomainName = domainName.replaceAll(".", "*");
        String obfuscatedSecondaryTLD = (secondaryTLD != null) ? secondaryTLD.replaceAll(".", "*") : "";

        return usernamePrefix + obfuscatedUsernameSuffix + "@" + obfuscatedDomainName + firstDot + topLevelDomain +
                (secondDot != null ? secondDot : "") + obfuscatedSecondaryTLD;
    }
}