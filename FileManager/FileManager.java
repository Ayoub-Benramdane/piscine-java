import java.io.*;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        new FileWriter(fileName).write(content);
    }

    public static String getContentFile(String fileName) throws IOException {
        if (fileName == null) {
            return "";
        }
        InputStream inputStream = new FileInputStream(fileName);
        byte[] buffer = new byte[4096];
        StringBuilder res = new StringBuilder();
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            res.append(new String(buffer, 0, bytesRead));
        }
        return res.toString();
    }

    public static void deleteFile(String fileName) {
        new File(fileName).delete();
    }
}