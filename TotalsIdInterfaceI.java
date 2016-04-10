package cs310_assn2_attempt1;


import cs310_assn2_attempt1.IdInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ragan E. Lake
 */
public interface TotalsIdInterfaceI extends IdInterface {
    
    /**Totals amount of donations.*/
    
    public double getAmountOfDonations();
    
    /**Totals amount of donations by donor ID.*/
    
    public double getAmountOfDonations(int donorID);
    
    /**Totals donations*/
    
    public int getNumberOfDonations();
    
    /**Totals donations by donor.*/
    
    public int getNumberOfDonations (int donorID);
}
