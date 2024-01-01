package Tester;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Files {
    public static void main(String[] args) throws IOException {
        System.out.println("File[] listFiles(): ");
        File dir = new File("D:\\IdeaProjects\\Java_OU\\src\\Tester\\data");
        File[] children = dir.listFiles();
        for (File file : children) {
            System.out.println(file.getAbsolutePath());
        }

        System.out.println();

        System.out.println("String[] list(): ");
        String[] paths = dir.list();
        for (String path : paths) {
            if(path.equals("a.txt")){}
//                System.out.println(Arrays.toString(Arrays.stream(path.split("\\.")).toArray()));

        }

    }
}
