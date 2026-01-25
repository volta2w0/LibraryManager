package control;

import dao.LibraryItemDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haidang7320
 */
import dto.LibraryItemDTO;
public class AddItemController {
    private LibraryItemDAO libraryItemDAOInterface;
    public AddItemController(LibraryItemDAO dao) {
        libraryItemDAOInterface = dao;
    }

    public void addItem(LibraryItemDTO dto) {
        libraryItemDAOInterface.create(dto);
    }
}
