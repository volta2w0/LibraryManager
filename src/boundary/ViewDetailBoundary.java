/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;
import control.ViewDetailController;
import dto.LibraryItemDTO;
import javax.swing.JOptionPane;

import dao.LibraryItemDAO;
import dao.MemoryLibraryItemDAO;
/**
 *
 * @author Haidang7320
 */
public class ViewDetailBoundary {
    public void show()
    {
        long id = Long.parseLong(
                JOptionPane.showInputDialog("Nhập ID")
        );
        LibraryItemDAO dao = new MemoryLibraryItemDAO();
        LibraryItemDTO dto = new ViewDetailController(dao).viewDetail(id);

        if(dto == null)
        {
            JOptionPane.showMessageDialog(null, "Khong co du lieu");
            
        }
        else
        {
            String info;

            switch (dto.getType().toLowerCase()) {
                case "book":
                    info = "Page: " + dto.getValue();
                    break;
                case "dvd":
                    info = "Duration: " + dto.getValue();
                    break;
                case "magazine":
                    info = "Issue Number: " + dto.getValue();
                    break;
                default:
                    info = "Value: " + dto.getValue();
            }

            JOptionPane.showMessageDialog(
                null,
                dto.getId() + " | " + dto.getTitle() + " | " + dto.getType() + " | " + info
            );
        }
    }
}
