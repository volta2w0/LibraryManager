package control;

import entity.*;
import java.util.ArrayList;

public class LibraryManagerController {
    private ArrayList<LibraryItem> list = new ArrayList<>();

    public void addItem(LibraryItem item) {
        list.add(item);
    }

    public boolean removeById(long id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<LibraryItem> getAllItems() {
        return list;
    }
}
