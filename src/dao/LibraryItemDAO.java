package dao;

import dto.LibraryItemDTO;
import entity.LibraryItem;

public interface LibraryItemDAO {
    LibraryItem create(LibraryItemDTO dto);
    LibraryItem getById(long id);
    java.util.Map<Long, LibraryItem> getAll();
    boolean remove(long id);
    
}
