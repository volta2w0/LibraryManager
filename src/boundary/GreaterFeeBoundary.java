/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;

/**
 *
 * @author Haidang7320
 */
import control.GreaterFeeController;
import dao.LibraryItemDAO;
import dao.MemoryLibraryItemDAO;
import dto.LibraryItemDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class GreaterFeeBoundary {

    public void show() {
        String input = JOptionPane.showInputDialog("Nhap so ngay muon:");
        if (input == null) return;

        int days;
        try {
            days = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "So ngay khong hop le");
            return;
        }
        LibraryItemDAO dao = new MemoryLibraryItemDAO();
        GreaterFeeController control = new GreaterFeeController(dao);
        ArrayList<LibraryItemDTO> list = control.filter(days);

        if (list.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Khong co tai lieu nao co phi  > 2$");
            return;
        }

        StringBuilder sb = new StringBuilder("Danh sach tai lieu > 2$\n\n");

        for (LibraryItemDTO dto : list) {
            sb.append("ID: ").append(dto.getId())
              .append("\nTen: ").append(dto.getTitle())
              .append("\nLoai: ").append(dto.getType())
              .append("\n");

            if (dto.getType().equalsIgnoreCase("Book")) {
                sb.append("Page: ").append(dto.getValue());
            } else if (dto.getType().equalsIgnoreCase("DVD")) {
                sb.append("Duration: ").append(dto.getValue());
            } else if (dto.getType().equalsIgnoreCase("Magazine")) {
                sb.append("Issue Number: ").append(dto.getValue());
            } else {
                sb.append("Value: ").append(dto.getValue());
            }

            sb.append("\n--------------------\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}

