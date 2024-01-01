package BaiThucHanh3.Bai3SanPham;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class MainSanPham {
    private static final QuanLySanPham quanLySanPham = new QuanLySanPham();

    public static void menu() {
        System.out.println("    Menu");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Xóa sản phẩm");
        System.out.println("3. Cật nhật sản phẩm");
        System.out.println("4. Tìm kiếm sản phẩm");
        System.out.println("5. Sắp xếp sản phẩm giảm dần");
        System.out.println("6. Xem danh sách sản phẩm");
        System.out.println("7. Thoát");
        System.out.print("    --> ");
    }

    public static void main(String[] args) {
        boolean flagExit = true;
        int flagMenu = 0;

        try {
            quanLySanPham.docFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (flagExit) {
            menu();
            flagMenu = Integer.parseInt(SanPham.scanner.nextLine());

            switch (flagMenu) {
                case 1: {
                    System.out.print("Bạn muốn nhập băng đĩa hay sách (1/0): ");
                    SanPham sanPham;
                    int flagAdd = Integer.parseInt(SanPham.scanner.nextLine());
                    if (flagAdd == 1) {
                        sanPham = new BangDia();
                        sanPham.nhapSanPham();
                    } else {
                        sanPham = new Sach();
                        sanPham.nhapSanPham();
                    }

                    quanLySanPham.themSanPham(sanPham);
                    break;
                }
                case 2: {
                    System.out.print("Bạn muốn xóa bằng mã SP hay SP (1/0): ");
                    int flagDel = Integer.parseInt(SanPham.scanner.nextLine());
                    if (flagDel == 1) {
                        System.out.print("Nhập mã SP: ");
                        quanLySanPham.xoaSanPham(SanPham.scanner.nextLine());
                    } else {
                        System.out.print("Bạn muốn xóa băng đĩa hay sách (1/0): ");
                        SanPham sanPham;
                        int flagAdd = Integer.parseInt(SanPham.scanner.nextLine());
                        if (flagAdd == 1) {
                            sanPham = new BangDia();
                            sanPham.nhapSanPham();
                        } else {
                            sanPham = new Sach();
                            sanPham.nhapSanPham();
                        }
                        quanLySanPham.xoaSanPham(sanPham);
                    }
                    break;
                }
                case 3: {

                    break;
                }
                case 4: {
                    System.out.print("Bạn muốn tìm theo mã SP, tên SP, hay giá SP (2/1/0): ");
                    int flagFind = Integer.parseInt(SanPham.scanner.nextLine());
                    if (flagFind == 2) {
                        System.out.print("Nhập mã SP: ");
                        quanLySanPham.timSanPham(SanPham.scanner.nextLine()).hienThi();
                    } else if (flagFind == 1) {
                        int a;
                    } else {
                        System.out.println("Nhập khoảng giá:");
                        System.out.print("Nhập giá trên:");
                        double giaTren = Double.parseDouble(SanPham.scanner.nextLine());
                        System.out.print("Nhập giá dưới:");
                        double giaDuoi = Double.parseDouble(SanPham.scanner.nextLine());
                        quanLySanPham.timSanPham(giaDuoi, giaTren).forEach(SanPham::hienThi);
                    }
                    break;
                }
                case 5: {
                    quanLySanPham.sorted();
                    break;
                }
                case 6: {
                    quanLySanPham.hienThi();
                    break;
                }
                case 8: {

                    break;
                }
                case 7: {
                    flagExit = false;
                    break;
                }


            }
        }


    }
}
//public static void main(String[] args) {
//        QuanLySanPham sanPhams=new QuanLySanPham();
//        sanPhams.docFile();
//        sanPhams.xoaSanPham("26");
////        sanPhams.themSanPham(new Sach("26","1","1","1",1,1));
//        sanPhams.hienThi();
////    new File("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh3\\Bai3SanPham\\Data\\BangDia.txt").delete();
////    try {
////        FileWriter file= new FileWriter("D:\\IdeaProjects\\Java_OU\\src\\BaiThucHanh3\\Bai3SanPham\\Data\\BangDia.txt");
////        file.write("â");
////        file.close();
////    } catch (IOException e) {
////        throw new RuntimeException(e);
////    }
//
//}
//}
