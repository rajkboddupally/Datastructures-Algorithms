package string;

import java.io.File;

public class RecurssiveFileSearch {
    public static int files(File dir, int counter) {

        File[] files = dir.listFiles();

        for (File file : files) {
            if (!file.isDirectory() && file.getName().contains(".java")) {
                counter++;
            } else if (file.isDirectory()) {
                counter = files(file, counter);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int counter = 0;
        System.out.println(files(new File("C:\\Users\\adhvi\\IdeaProjects\\DSALGO\\src\\arrays"), counter));
    }
}
