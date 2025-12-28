package control;

import entity.*;
import java.util.ArrayList;

public class LibraryStatisticController {

    public int countBook(ArrayList<LibraryItem> list) {
        int count = 0;
        for (LibraryItem i : list) {
            if (i instanceof Book) count++;
        }
        return count;
    }

    public int countDVD(ArrayList<LibraryItem> list) {
        int count = 0;
        for (LibraryItem i : list) {
            if (i instanceof DVD) count++;
        }
        return count;
    }

    public int countMagazine(ArrayList<LibraryItem> list) {
        int count = 0;
        for (LibraryItem i : list) {
            if (i instanceof Magazine) count++;
        }
        return count;
    }
}
