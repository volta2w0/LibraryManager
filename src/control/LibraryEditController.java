package control;

import entity.*;

public class LibraryEditController {

    public boolean updateTitle(LibraryItem item, String newTitle) {
        if (item == null || newTitle == null || newTitle.isEmpty()) {
            return false;
        }
        item.setTitle(newTitle);
        return true;
    }

    public boolean updateBookInfo(LibraryItem item, String author, int pages) {
        if (!(item instanceof Book)) return false;

        Book b = (Book) item;
        b.setValue(pages);
        return true;
    }

    public boolean updateDVDInfo(LibraryItem item, int duration) {
        if (!(item instanceof DVD)) return false;

        DVD d = (DVD) item;
        d.setValue(duration);
        return true;
    }

    public boolean updateMagazineInfo(LibraryItem item, int issueNumber) {
        if (!(item instanceof Magazine)) return false;

        Magazine m = (Magazine) item;
        m.setValue(issueNumber);
        return true;
    }
}
