package Folders;

import java.time.LocalDate;

public class Folder {
    private String name;
    private LocalDate ngayTao;
    private Folder folder;

    public Folder(String name) {
        this.name = name;
        this.ngayTao=LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }
}
