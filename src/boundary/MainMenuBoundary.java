/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;

/**
 *
 * @author Haidang7320
 */
public class MainMenuBoundary {


    public MainMenuBoundary() {
    }

    public void run() {
        while (true) {
            int choice = showMenu();

            switch (choice) {
                case 1:
                    AddItemBoundary.show();
                    break;

                case 2:
                    RemoveItemBoundary.show();
                    break;
                case 3:
                    ViewDetailBoundary.show();
                    break;
                case 4:
                    SearchItemBoundary.show();
                    break;
                case 5:
                    UpdateItemBoundary.show();
                    break;
                case 6:
                    CountItemBoundary.show();
                    break;
                case 7:
                    ListAllBoundary.show();
                    break;
                case 8:
                    GreaterFeeBoundary.show();
                    break;
                case 0:
                    return;

                default:
                    break;
            }
        }
    }

    private int showMenu() {
        String menu =
              "===== QUAN LY THU VIEN =====\n"
            + "1. Them moi Tai lieu\n"
            + "2. Xoa Tai lieu\n"
            + "3. Xem Chi Tiet Tai Lieu\n"
            + "4. Tim kiem Tai lieu\n"
            + "5. Cap nhat tai lieu\n"
            + "6. Thong ke so luong\n"
            + "7. In danh sach Tai lieu\n"
            + "8. Danh sach phi muon > 2$\n"
            + "0. Thoat";

        String choice =
                javax.swing.JOptionPane.showInputDialog(menu);

        if (choice == null) return 0;
        return Integer.parseInt(choice);
    }
}
