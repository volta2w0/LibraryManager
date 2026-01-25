/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import entity.LibraryItem;
import dao.LibraryItemDAO;
/**
 *
 * @author Haidang7320
 */
public class CountItemController {
    private LibraryItemDAO dao;
    public CountItemController(LibraryItemDAO dao) {
        this.dao = dao;
    }
    public int count(String type) {
        int count = 0;
        for (LibraryItem i : dao.getAll().values()) {
            if (i.getType().equalsIgnoreCase(type))
                count++;
        }
        return count;
    }

}
