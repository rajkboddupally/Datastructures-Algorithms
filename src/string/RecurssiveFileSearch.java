package string;

import java.io.File;
import java.util.Objects;

public class RecurssiveFileSearch {
    public static int files(File dir, int counter) {

        File[] files = dir.listFiles();

        for (int i = 0, filesLength = Objects.requireNonNull(files).length; i < filesLength; i++) {
            File file = files[i];
            if (!file.isDirectory() && file.getName().contains(".java")) {
                counter++;
            } else if (file.isDirectory() && !file.getName().contains("test")) {
                counter = files(file, counter);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int counter = 0;
        System.out.println(files(new File("C:\\Users\\adhvi\\IdeaProjects"), counter));
    }
}
