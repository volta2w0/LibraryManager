package boundary;

import control.LibraryManagerController;
import entity.*;
import javax.swing.JOptionPane;

public class AddItemBoundary {

    private LibraryManagerController manager;

    public AddItemBoundary(LibraryManagerController manager) {
        this.manager = manager;
    }

    public void addItem() {
        String[] types = {"Book", "DVD", "Magazine"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Chon loai tai lieu",
                "Them tai lieu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                types,
                types[0]);

        if (choice == -1) return;

        long id = Long.parseLong(
                JOptionPane.showInputDialog("Nhap ID"));
        String title =
                JOptionPane.showInputDialog("Nhap tieu de");

        if (choice == 0) {
            int pages = Integer.parseInt(
                    JOptionPane.showInputDialog("Nhap so trang"));
            manager.addItem(new Book(id, title, pages));
        }

        if (choice == 1) {
            int duration = Integer.parseInt(
                    JOptionPane.showInputDialog("Nhap thoi luong"));
            manager.addItem(new DVD(id, title, duration));
        }

        if (choice == 2) {
            int issue = Integer.parseInt(
                    JOptionPane.showInputDialog("Nhap so phat hanh"));
            manager.addItem(new Magazine(id, title, issue));
        }

        JOptionPane.showMessageDialog(null, "Them tai lieu thanh cong");
    }
}
