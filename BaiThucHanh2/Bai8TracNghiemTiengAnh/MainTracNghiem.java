package BaiThucHanh2.Bai8TracNghiemTiengAnh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainTracNghiem {
    private static ArrayList<CauHoi> cauHois;

    public static void main(String[] args) throws IOException {

        boolean flagExit = true;
        while (flagExit) {
            Helper.menuMain();
            int flagMain = new Scanner(System.in).nextInt();
            switch (flagMain) {
                case 1: {
                    Helper.themCauHoiVaoFolder();
                    break;
                }
                case 2: {
                    Helper.luyenThiTiengAnh();
                    break;
                }
                case 3: {
                    flagExit = false;
                    break;
                }
            }
        }
    }
}
