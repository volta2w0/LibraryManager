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
    public int count(String type) {
        int count = 0;
        for (LibraryItem i : LibraryItemDAO.getAll())
            if (i.getType().equalsIgnoreCase(type))
                count++;
        return count;
    }

}
