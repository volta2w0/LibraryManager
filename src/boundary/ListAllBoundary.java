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
import dao.LibraryItemDAO;
import dao.MemoryLibraryItemDAO;
import dto.LibraryItemDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class ListAllBoundary {
        public void show() {
        LibraryItemDAO dao = new MemoryLibraryItemDAO();
        ListAllController control = new ListAllController(dao);
        ArrayList<LibraryItemDTO> list = control.listAll();

        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Khong co tai lieu nao");
            return;
        }

        StringBuilder sb = new StringBuilder("Danh sach tai lieu\n\n");

        for (LibraryItemDTO dto : list) {
            sb.append(dto.formatDisplay()).append("\n");

            switch (dto.getType().toLowerCase()) {
                case "book":
                    sb.append("Page: ").append(dto.getValue());
                    break;
                case "dvd":
                    sb.append("Duration: ").append(dto.getValue());
                    break;
                case "magazine":
                    sb.append("Issue Number: ").append(dto.getValue());
                    break;
                default:
                    sb.append("Value: ").append(dto.getValue());
            }

            sb.append("\n--------------------\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
