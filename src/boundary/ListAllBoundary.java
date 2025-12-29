/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;

/**
 *
 * @author Haidang7320
 */
import control.ListAllController;
import dto.LibraryItemDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ListAllBoundary {
        public static void show() {
        ListAllController control = new ListAllController();
        ArrayList<LibraryItemDTO> list = control.listAll();

        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Khong co tai lieu nao");
            return;
        }

        StringBuilder sb = new StringBuilder("danh sach tai lieu \n\n");

        for (LibraryItemDTO dto : list) {
            sb.append("ID: ").append(dto.id)
              .append("\nTieu de: ").append(dto.title)
              .append("\nLoai: ").append(dto.type)
              .append("\nValue: ").append(dto.value)
              .append("\n--------------------\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
