/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import dto.LibraryItemDTO;
import dao.LibraryItemDAO;
import entity.LibraryItem;
/**
 *
 * @author Haidang7320
 */
public class GreaterFeeController {
        public ArrayList<LibraryItemDTO> filter(int days) {
        ArrayList<LibraryItemDTO> result = new ArrayList<>();

        for (LibraryItem item : LibraryItemDAO.getAll()) {
            if (item.calculateFee(days) > 2) {
                LibraryItemDTO dto = new LibraryItemDTO();
                dto.id = item.getId();
                dto.title = item.getTitle();
                dto.type = item.getType();
                dto.value = item.getValue();

                result.add(dto);
            }
        }
        return result;
    }
}
