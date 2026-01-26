/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author Haidang7320
 */
import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import entity.LibraryItem;
import exception.ItemNotFoundException;

public class ViewDetailController {
    private LibraryItemDAO LibraryItemDAO;
    public ViewDetailController(LibraryItemDAO dao) {
        this.LibraryItemDAO = dao;
    }
    public LibraryItemDTO viewDetail(long id) throws ItemNotFoundException
    {
       LibraryItem item = LibraryItemDAO.getById(id);
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.setId(item.getId());
        dto.setTitle(item.getTitle());
        dto.setType(item.getType());
        dto.setValue(item.getValue());

        return dto;
    }
}
