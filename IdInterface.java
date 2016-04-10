package cs310_assn2_attempt1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ragan E. Lake
 */
public interface IdInterface {
    
    /**Adds an object*/
    
    public boolean add (Object obj);
    
    /**Removes an object.*/
    
    public boolean remove (Object obj);
    
    /**Validates that the ID of an object is unique.*/
    
    public boolean isIDUnique (int ID);
}
