/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;
import javax.swing.JOptionPane;
import dto.LibraryItemDTO;
import control.SearchItemController;
import dao.LibraryItemDAO;
import util.UIExceptionHandler;

import java.util.ArrayList;
/**
 *
 * @author Haidang7320
 */
public class SearchItemBoundary {
    private LibraryItemDAO dao;
    public SearchItemBoundary(LibraryItemDAO dao) {
        this.dao = dao;
    }
    public void show()
    {
        try {
            String title = JOptionPane.showInputDialog("Nhap Tieu De Can Tim:");
            if (title == null || title.trim().isEmpty()) {
                UIExceptionHandler.showWarning("Vui lòng nhập tiêu đề!");
                return;
            }
            ArrayList<LibraryItemDTO> list = new SearchItemController(dao).search(title);
            showlist(list);
        } catch (Exception e) {
            UIExceptionHandler.handleException(e);
        }
    }
    private void showlist(ArrayList<LibraryItemDTO> list)
    {
        if (list.isEmpty()) {
            UIExceptionHandler.showInfo("Không có kết quả tìm kiếm");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (LibraryItemDTO dto : list) {
            sb.append(dto.formatDisplay()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
