package control;

import entity.*;

public class LibraryEditController {

    public void updateTitle(LibraryItem item, String newTitle) {
        if (item != null && newTitle != null && !newTitle.isEmpty()) {
            item.setTitle(newTitle);
        }
    }

    public boolean updateBook(
            LibraryItem item,
            String newTitle,
            int pages) {

        if (!(item instanceof Book)) return false;

        Book b = (Book) item;
        b.setTitle(newTitle);
        b.setValue(pages);
        return true;
    }

    // Sua thong tin DVD
    public boolean updateDVD(
            LibraryItem item,
            String newTitle,
            int duration) {

        if (!(item instanceof DVD)) return false;

        DVD d = (DVD) item;
        d.setTitle(newTitle);
        d.setValue(duration);
        return true;
    }

    // Sua thong tin Tap chi
    public boolean updateMagazine(
            LibraryItem item,
            String newTitle,
            int issueNumber) {

        if (!(item instanceof Magazine)) return false;

        Magazine m = (Magazine) item;
        m.setTitle(newTitle);
        m.setValue(issueNumber);
        return true;
    }
}