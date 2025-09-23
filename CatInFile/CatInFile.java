import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(args[0]);
        var data = System.in.readAllBytes();
        file.write(data);
        file.close();
    }
}