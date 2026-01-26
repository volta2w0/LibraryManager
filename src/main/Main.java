package main;


import boundary.MainMenuBoundary;
import dao.FileLibraryItemDAO;
import dao.LibraryItemDAO;

public class Main {

    public static void main(String[] args) {
        LibraryItemDAO dao = new FileLibraryItemDAO();
        new MainMenuBoundary(dao).run();
    }
}
