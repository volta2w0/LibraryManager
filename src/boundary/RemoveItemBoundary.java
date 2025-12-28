/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;
import javax.swing.JOptionPane;

import control.LibraryManagerController;

/**
 *
 * @author Haidang7320
 */
public class RemoveItemBoundary {
    private LibraryManagerController manager;

    public RemoveItemBoundary(LibraryManagerController manager) {
        this.manager = manager;
    }
    public void removeItem()
    {
        long id = Long.parseLong(
        JOptionPane.showInputDialog("Nhap ID"));
        if(manager.removeById(id))
        {
            JOptionPane.showMessageDialog(null, "Xoa Tai Lieu Thanh Cong");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Xoa Tai Lieu That Bai");
        }
    }
}
