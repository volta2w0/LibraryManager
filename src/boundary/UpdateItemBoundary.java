/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;

/**
 *
 * @author Haidang7320
 */
import control.UpdateItemController;
import dto.LibraryItemDTO;
import dao.LibraryItemDAO;
import dao.MemoryLibraryItemDAO;

import javax.swing.JOptionPane;
public class UpdateItemBoundary {
    public void show() {
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.setId(Long.parseLong(JOptionPane.showInputDialog("Nhập ID cần sửa")));
        dto.setTitle(JOptionPane.showInputDialog("Nhập title mới"));
        dto.setValue(Integer.parseInt(JOptionPane.showInputDialog("Nhập gia tri mới: ")));
        LibraryItemDAO dao = new MemoryLibraryItemDAO();
        UpdateItemController up = new UpdateItemController(dao);
        boolean result = up.update(dto);

        JOptionPane.showMessageDialog(null,
                result ? "Sửa thành công" : "Không tìm thấy tài liệu");
    }
}