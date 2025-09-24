import java.io.File;

public class FileSearch {
    public static String searchFile(String fileName) {
        System.out.println("klj");
        File dir = new File("doucuments");
        File[] files = dir.listFiles();
        System.out.println("kljaa");
        if (files != null) {
            System.out.println("kaaalj");
            for (File file : files) {
                if (file.isDirectory()) {
                    String result = searchFile(fileName);
                    if (result != null) {
                        return result;
                    }
                } else if (file.getName().equals(fileName)) {
                    return file.getPath();
                }
            }
        }
        return null;
    }
}