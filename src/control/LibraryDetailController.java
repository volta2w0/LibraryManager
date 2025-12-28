package control;

import entity.*;

public class LibraryDetailController {

    public String getItemDetail(LibraryItem item) {
        if (item == null) {
            return "Khong tim thay tai lieu";
        }

        String result = "";
        result += "Ma tai lieu: " + item.getId() + "\n";
        result += "Tieu de: " + item.getTitle() + "\n";

        if (item instanceof Book) {
            Book b = (Book) item;
            result += "Loai: Sach\n";
            result += "So trang: " + b.getValue() + "\n";
        }

        if (item instanceof DVD) {
            DVD d = (DVD) item;
            result += "Loai: DVD\n";
            result += "Thoi luong: " + d.getValue() + " phut\n";
        }

        if (item instanceof Magazine) {
            Magazine m = (Magazine) item;
            result += "Loai: Tap chi\n";
            result += "So phat hanh: " + m.getValue() + "\n";
        }

        return result;
    }
}
