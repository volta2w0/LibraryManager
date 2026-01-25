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
import java.util.ArrayList;
public class ListAllController {
    private LibraryItemDAO LibraryItemDAO;
    public ListAllController(LibraryItemDAO dao) {
        this.LibraryItemDAO = dao;
    }
    public ArrayList<LibraryItemDTO> listAll() {
        ArrayList<LibraryItemDTO> result = new ArrayList<>();

        for (LibraryItem item : LibraryItemDAO.getAll().values()) {
            LibraryItemDTO dto = new LibraryItemDTO();
            dto.setId(item.getId());
            dto.setTitle(item.getTitle());
            dto.setType(item.getType());
            dto.setValue(item.getValue());

            result.add(dto);
        }
        return result;
    }
}
