/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author Haidang7320
 */
import control.AddItemController;
import dto.LibraryItemDTO;


public class fakedb {

    public static void load() {
        AddItemController control = new AddItemController();

        // ===== BOOKS =====
        control.addItem(dto(1, "Java OOP Basics", "Book", 120));
        control.addItem(dto(2, "Clean Code", "Book", 450));

        // ===== DVDs =====
        control.addItem(dto(8, "Inception", "DVD", 148));
        control.addItem(dto(9, "Interstellar", "DVD", 169));
        control.addItem(dto(10, "The Matrix", "DVD", 136));


        // ===== MAGAZINES =====
        control.addItem(dto(14, "Time Magazine 2024", "Magazine", 12));
        control.addItem(dto(15, "National Geographic", "Magazine", 5));

    }

    private static LibraryItemDTO dto(long id, String title, String type, int value) {
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.id = id;
        dto.title = title;
        dto.type = type;
        dto.value = value;
        return dto;
    }
}
