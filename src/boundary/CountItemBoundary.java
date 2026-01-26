/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundary;
 
/**
 *
 * @author Haidang7320
 */
import javax.swing.JOptionPane;
import control.CountItemController;
import dao.LibraryItemDAO;
import util.UIExceptionHandler;

public class CountItemBoundary {
    private LibraryItemDAO dao;
    public CountItemBoundary(LibraryItemDAO dao) {
        this.dao = dao;
    }
    public void show() {
        try {
            CountItemController control = new CountItemController(dao);

            int book = control.count("Book");
            int dvd = control.count("DVD");
            int magazine = control.count("Magazine");

            JOptionPane.showMessageDialog(null,
                "📚 Book: " + book +
                "\n🎬 DVD: " + dvd +
                "\n📰 Magazine: " + magazine);
        } catch (Exception e) {
            UIExceptionHandler.handleException(e);
        }
    }
}
