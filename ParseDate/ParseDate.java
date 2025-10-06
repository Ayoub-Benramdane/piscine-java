import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) return null;
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) return null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.ENGLISH);
        String formattedString = capitalizeEachWord(stringDate);
        return LocalDate.parse(formattedString, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null || stringDate.isEmpty()) return null;
        Pattern pattern = Pattern.compile("(\\d{1,2}).*?(morning|afternoon|evening|night).*?(\\d{1,2}).*?(\\d{1,2})", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(stringDate);

        if (matcher.find()) {
            int hour = Integer.parseInt(matcher.group(1));
            String period = matcher.group(2).toLowerCase();
            int minute = Integer.parseInt(matcher.group(3));
            int second = Integer.parseInt(matcher.group(4));

            if ((period.contains("afternoon") || period.contains("evening") || period.contains("night")) && hour < 12) {
                hour += 12;
            }

            LocalTime time = LocalTime.of(hour % 24, minute, second);
            return time;
        }

        return null;
    }

    private static String capitalizeEachWord(String input) {
        String[] words = input.split("\\s+");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }
        return capitalized.toString().trim();
    }
}
