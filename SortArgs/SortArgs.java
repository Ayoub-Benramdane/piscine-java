import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        Arrays.sort(args);
        int count = 0;
        for (String arg: args) {
            count++;
            System.out.print(arg);
            if (count < args.length) System.out.print(" ");
        }
        System.out.println();
    }
}