/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;

import control.AddItemController;
import dto.LibraryItemDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author Haidang7320
 */
public class AddItemBoundary {
    public static void show() {
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.id = Long.parseLong(JOptionPane.showInputDialog("ID"));
        dto.title = JOptionPane.showInputDialog("Title");
        dto.type = JOptionPane.showInputDialog("Book / DVD / Magazine");
        dto.value = Integer.parseInt(JOptionPane.showInputDialog("Pages / Duration / Issue"));

        new AddItemController().addItem(dto);
    }
}

