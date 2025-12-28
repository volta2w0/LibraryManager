package main;

import boundary.*;
import control.*;

public class Main {

    public static void main(String[] args) {

        LibraryManagerController manager = new LibraryManagerController();
        LibraryDetailController detailCtrl = new LibraryDetailController();
        LibraryEditController editCtrl = new LibraryEditController();
        LibrarySearchController searchCtrl = new LibrarySearchController();
        LibraryStatisticController statCtrl = new LibraryStatisticController();
        LibraryPrintController printCtrl = new LibraryPrintController();
        LibraryFeeController feeCtrl = new LibraryFeeController();

        AddItemBoundary addBoundary = new AddItemBoundary(manager);
        RemoveItemBoundary removeBoundary = new RemoveItemBoundary(manager);
        MainMenuBoundary menu = new MainMenuBoundary();

        while (true) {
            int choice = menu.showMenu();

            switch (choice) {
                case 1:
                    addBoundary.addItem();
                    break;
                case 2:
                    removeBoundary.removeItem();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
}
