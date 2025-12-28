package boundary;

import javax.swing.JOptionPane;

public class MainMenuBoundary {

    public int showMenu() {
        String menu =
              "===== QUAN LY THU VIEN =====\n"
            + "1. Them moi Tai lieu\n" //Done
            + "2. Xoa Tai lieu\n" // Done
            + "3. Xem Chi Tiet Tai Lieu\n"
            + "4. Xoa Tai lieu\n"
            + "5. Tim kiem Tai lieu\n"
            + "6. Thong ke so luong\n"
            + "7. In danh sach Tai lieu\n"
            + "8. Danh sach phi muon > 2$\n"
            + "0. Thoat";

        String choice = JOptionPane.showInputDialog(menu);
        if (choice == null) return -1;

        return Integer.parseInt(choice);
    }
}