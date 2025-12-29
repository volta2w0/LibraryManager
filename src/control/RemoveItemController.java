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

public class RemoveItemController {
    public boolean removeItem(long id) {
        return LibraryItemDAO.remove(id);
    }
}

