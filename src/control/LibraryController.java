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
public class LibraryController {
    private ArrayList<LibraryItem> list = new ArrayList<>();
    public void addItem(LibraryItem item)
    {
        list.add(item);
    }
    public void removeItem(LibraryItem item)
    {
        list.remove(item);
    }
    public LibraryItem findbyID(long id)
    {
        for(LibraryItem i : list)
        {
            if(i.getId() == id) return i;
        }
        return null;
    }
    public  ArrayList<LibraryItem> getAllItems()
    {
        return list;
    }
    public int countBook()
    {
        int count = 0;
        for(LibraryItem i : list)
        {
            if(i instanceof Book)
            {
                count++;
            }
        }
        return count;
    }
    public int countDVD()
    {
        int count = 0;
        for(LibraryItem i : list)
        {
            if(i instanceof DVD)
            {
                count++;
            }
        }
        return count;
    }
    public int countMagazine()
    {
        int count = 0;
        for(LibraryItem i : list)
        {
            if(i instanceof Magazine)
            {
                count++;
            }
        }
        return count;
    }
    public ArrayList<LibraryItem> filterFees(int days)
    {
        ArrayList<LibraryItem> result = new ArrayList<>();
        for(LibraryItem i : list)
        {
            if(i.calculateFee(days) > 2)
            {
                result.add(i);
            }
        }
        return result;
    }
    
}
