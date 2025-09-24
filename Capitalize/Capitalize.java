import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length != 0) {
            InputStream inputStream = new FileInputStream(args[0]);
            FileOutputStream outputStream = new FileOutputStream(args[1]);
            var file = new String(inputStream.readAllBytes());
            var lines = file.split("\n");
            List<String> res = new ArrayList<>();
            for (String line : lines) {
                var words = line.split(" ");
                for (String word : words) {
                    res.add(word.substring(0, 1).toUpperCase() + word.substring(1));
                }
            }
            outputStream.write(res.toString().getBytes());
            inputStream.close();
            outputStream.close();
        }
    }
}