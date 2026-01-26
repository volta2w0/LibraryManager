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
import exception.ItemRemovalFailedException;

public class RemoveItemController {
    private LibraryItemDAO LibraryItemDAO;
    public RemoveItemController(LibraryItemDAO dao) {
        this.LibraryItemDAO = dao;
    }
    public void removeItem(long id) throws ItemRemovalFailedException {
        LibraryItemDAO.remove(id);
    }
}

