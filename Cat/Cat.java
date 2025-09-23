import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        for (String filePath : args) {
            InputStream inputStream = new FileInputStream(filePath);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
        }
    }
}
