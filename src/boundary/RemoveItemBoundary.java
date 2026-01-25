/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;
import control.RemoveItemController;
import dao.LibraryItemDAO;
import dao.MemoryLibraryItemDAO;

import javax.swing.JOptionPane;
/**
 *
 * @author Haidang7320
 */
public class RemoveItemBoundary {
    public void show() {
        long id = Long.parseLong(JOptionPane.showInputDialog("Nhap ID can xoa: "));
        LibraryItemDAO dao = new MemoryLibraryItemDAO();
        boolean result  = new RemoveItemController(dao).removeItem(id);
        if(result)
        {
            JOptionPane.showMessageDialog(null,"Da Xoa");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Chua Xoa");

        }
    }
}
