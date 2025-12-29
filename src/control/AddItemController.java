package control;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haidang7320
 */
import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import entity.*;

public class AddItemController {
    public void addItem(LibraryItemDTO dto) {
        LibraryItem item = null;

        if (dto.type.equalsIgnoreCase("Book"))
            item = new Book(dto.id, dto.title, dto.value);
        else if (dto.type.equalsIgnoreCase("DVD"))
            item = new DVD(dto.id, dto.title, dto.value);
        else if (dto.type.equalsIgnoreCase("Magazine"))
            item = new Magazine(dto.id, dto.title, dto.value);

        if (item != null)
            LibraryItemDAO.add(item);
    }
}
