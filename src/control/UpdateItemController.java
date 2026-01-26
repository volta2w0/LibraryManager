/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import entity.LibraryItem;
import exception.ItemNotFoundException;

public class UpdateItemController {
    private LibraryItemDAO LibraryItemDAO;
    public UpdateItemController(LibraryItemDAO dao) {
        this.LibraryItemDAO = dao;
    }
    public void update(LibraryItemDTO dto) throws ItemNotFoundException {
        LibraryItem item = LibraryItemDAO.getById(dto.getId());
        item.setTitle(dto.getTitle());
        item.setValue(dto.getValue());
    }
}

