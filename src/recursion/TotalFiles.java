package recursion;/* Raj Kumar Boddupally created on 4/4/2021 inside the package - recursion */

import java.io.File;

public class TotalFiles {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\adhvi\\IdeaProjects");
        System.out.println("Total files " + totalFiles(directory));
    }

    private static int totalFiles(File directory) {
        return totalFiles(directory, 0);
    }

    private static int totalFiles(File directory, int count) {

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            assert files != null;
            for (File file : files) {
                count = totalFiles(file, count);
            }
        }
        if (directory.getName().endsWith(".java")) {
            System.out.println(directory.getAbsolutePath());
            count++;
        }

        return count;
    }
}
