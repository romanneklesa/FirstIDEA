package CreationalFactory;

import java.io.*;

public class MainClass {

    public static void main(String[] args) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\1.txt"));
        MainClass main = new MainClass();
        File root = File.listRoots()[0];
        main.parse(root, writer);
        writer.close();
    }

    private void parse(File file1, BufferedWriter writer) throws IOException {
        File[] files = file1.listFiles(fileFilter);

        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                writer.write(file.getName() + "\n");
                parse(file, writer);
            } else {
                writer.write(file.getName() + "\n");
            }
        }

    }

    private FileFilter fileFilter = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.length() > 10000;
        }
    };
}
