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
public class CountItemBoundary {
        public static void show() {
        CountItemController control = new CountItemController();

        int book = control.count("Book");
        int dvd = control.count("DVD");
        int magazine = control.count("Magazine");

            JOptionPane.showMessageDialog(null,
                "Book: " + book +
                "\nDVD: " + dvd +
                "\nMagazine: " + magazine);
    }
}
