package db;

import java.util.HashMap;
import java.util.Map;

import entity.LibraryItem;

public class MemoryDatabase {
    
    private static  Map<Long, LibraryItem> items = new HashMap<>();

    public static void insert(LibraryItem item) {
        items.put(item.getId(), item);
    }

    public static LibraryItem getById(long id) {
        return items.get(id);
    }

    public static Map<Long, LibraryItem> getAll() {
        return items;
    }

    public static boolean remove(long id) {
        return items.remove(id) != null;
    }
}
