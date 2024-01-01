package Tester;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        QLSV qlsv=new QLSV();
        try {
            qlsv.loadFile("Tester\\data\\a.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        qlsv.hienThi();
    }
}
