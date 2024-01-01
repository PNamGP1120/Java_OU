package BaiThucHanh2.Bai8TracNghiemTiengAnh;

import java.io.File;
import java.util.Scanner;

public class CreateFolder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String folderName=scanner.nextLine();
        String path=String.format("C:\\Users\\ADMIN\\IdeaProjects\\Java_OU\\src\\BaiThucHanh2\\Bai8TracNghiemTiengAnh\\%s",folderName);

        if(new File(path).mkdir()){
            System.out.println("Folder is created");
        } else{
            System.out.println("Folder is existed");
        }
    }
}
