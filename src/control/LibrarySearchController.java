/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import entity.*;
import java.util.ArrayList;

/**
 *
 * @author Haidang7320
 */
public class LibrarySearchController {
    public LibraryItem findById(ArrayList<LibraryItem> list, long id) {
    for (LibraryItem item : list) {
        if (item.getId() == id) {
            return item;
        }
    }
    return null;
}
}
