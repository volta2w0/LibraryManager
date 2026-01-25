/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import entity.LibraryItem;
public class UpdateItemController {
    private LibraryItemDAO LibraryItemDAO;
    public UpdateItemController(LibraryItemDAO dao) {
        this.LibraryItemDAO = dao;
    }
    public boolean update(LibraryItemDTO dto) {
        LibraryItem item = LibraryItemDAO.getById(dto.getId());
        if (item == null) return false;
        item.setTitle(dto.getTitle());
        item.setValue(dto.getValue());
        return true;
    }
}

