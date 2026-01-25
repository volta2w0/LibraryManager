/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;

import control.AddItemController;
import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import dao.MemoryLibraryItemDAO;
import javax.swing.JOptionPane;
/**
 *
 * @author Haidang7320
 */
public class AddItemBoundary {
    public void show() {
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.setId(Long.parseLong(JOptionPane.showInputDialog("ID")));
        dto.setTitle(JOptionPane.showInputDialog("Title"));
        dto.setType(JOptionPane.showInputDialog("Book / DVD / Magazine"));
        dto.setValue(Integer.parseInt(JOptionPane.showInputDialog("Pages / Duration / Issue")));
        LibraryItemDAO dao = new MemoryLibraryItemDAO();
        AddItemController controller = new AddItemController(dao);
        controller.addItem(dto);
    }
}

