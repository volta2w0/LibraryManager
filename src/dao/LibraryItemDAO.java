/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Haidang7320
 */
import entity.LibraryItem;
import java.util.ArrayList;

public class LibraryItemDAO {
    private static ArrayList<LibraryItem> items = new ArrayList<>();

    public static void add(LibraryItem item) {
        items.add(item);
    }

    public static ArrayList<LibraryItem> getAll() {
        return items;
    }

    public static LibraryItem findById(long id) {
        for (LibraryItem i : items)
            if (i.getId() == id) return i;
        return null;
    }

    public static boolean remove(long id) {
        LibraryItem i = findById(id);
        if (i != null) {
            items.remove(i);
            return true;
        }
        return false;
    }
}