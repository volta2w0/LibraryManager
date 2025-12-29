/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;
import control.ViewDetailController;
import dto.LibraryItemDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author Haidang7320
 */
public class ViewDetailBoundary {
    public static void show()
    {
        long id = Long.parseLong(
                JOptionPane.showInputDialog("Nhập ID")
        );

        LibraryItemDTO dto = new ViewDetailController().viewDetail(id);

        if(dto == null)
        {
            JOptionPane.showMessageDialog(null, "Khong co du lieu");
            
        }
        else
        {
            JOptionPane.showMessageDialog(null ,dto.id + " | " + dto.title + " | " + dto.type );   // them switch sau de phan ra tung loai 
        }
    }
}
