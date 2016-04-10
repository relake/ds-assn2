/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs310_assn2_attempt1;

/**
 *
 * @author Ragan E. Lake
 */
public class Donation {
    
     /**donation ID*/
    int donationId;
    /**Donor ID*/
    int donorId;
    /**Donation description*/
    String donationDescription;
    /**Donation amount*/
    double donationAmount;
    /**Donation date*/
    String donationDate;
    /**Is the donation tax deductible*/
    String taxDeductible;
    
    /**Construct a donation with given values
     * 
     * @param donationId - the ID number of the donation
     * @param idOfDonor - the ID number of the donor
     * @param donDescription - a description of the donation
     * @param donAmt - the amount of the donation
     * @param dateOfDonation - the date of the donation
     * @param deductible - whether the donation is tax deductible
     */    
    
    public Donation(int donationId, int idOfDonor, String donDescription, 
            double donAmt, String dateOfDonation, String deductible) {
        this.donationId=donationId;
        this.donorId=idOfDonor;
        this.donationDescription=donDescription;
        this.donationAmount=donAmt;
        this.donationDate=dateOfDonation;
        this.taxDeductible=deductible;
    }
    
    /**Sets the ID number of the donation
     * 
     * @param donatId - donation ID number 
     */
    
    public void setDonationId (int donatId) {
        donationId=donatId;
    }
    
    /**Sets the ID number of the donor
     * 
     * @param donor_ID - donor ID number
     */
    
    public void setDonorId (int donor_ID) {
        donorId = donor_ID;
    }
    
    /**Sets the description of the donation
     * 
     * @param descriptOfDonation - description of the donation
     */
    
    public void setDonationDescription (String descriptOfDonation) {
        donationDescription = descriptOfDonation;
    }
    
    /**Sets the amount of the donation
     * 
     * @param amtOfDonation - the amount of the donation 
     */
    
    public void setDonationAmount (double amtOfDonation) {
        donationAmount = amtOfDonation;
    }
    
    /**Sets the date of the donation
     * 
     * @param don_Date - date of the donation 
     */
    
    public void setDonationDate (String don_Date) {
        donationDate=don_Date;
    }
    
    /**Sets whether or not the donation is tax deductible
     * 
     * @param isDeductible - whether the donation is tax deductible 
     */
    
    public void setTaxDeductible (String isDeductible) {
        taxDeductible=isDeductible;
    }
    
    /**Gets the ID number of the donation as a string.
     * 
     * @return the donation ID number
     */
    
    public int getDonationId () {
        return donationId;
    }
    
   
    /**Gets the ID number of the donor
     * 
     * @return the ID number of the donor
     */
    
    public int getDonorId () {
        return donorId;
    }
    
     /**Gets the description of the donation
     * 
     * @return the description of the donation  
     */
    
    public String getDonationDescription () {
        return donationDescription;
    }
    
     /**Gets the amount of the donation
     * 
     * @return the amount of the donation 
     */
    
    public double getDonationAmount () {
        return donationAmount;
    }
    
    /**Gets the date of the donation
     * 
     * @return the donation date 
     */
    
    public String getDonationDate () {
        return donationDate;
    }
     /**Gets whether or not the donation is tax deductible
     * 
     * @return true if the donation is tax deductible else false if it is not 
     */
    
    public String getTaxDeductible () {
        return taxDeductible;
    }
    
    public boolean getTaxDeductibleTrue (){
            char deductible = taxDeductible.charAt(0);
        if (deductible == 'Y' || deductible == 'y') {
            return true;
        } else {
            return false;
        }
    }
    
    /**Compares two Donation objects for equality.
     * 
     * @param donat The Second Donation object
     * @return true if the Donation objects have same ID number; false if they don't
     */
    
    @Override
    public boolean equals(Object obj) {
        
        final Donation other = (Donation) obj;
        if (this.donationId != other.donationId) {
            return false;
        }
        return true;
    }
 
     /**Retrieves the information in a Donation object.
     * 
     * @return the object state as a string 
     */
    
    
    public String toString () {
        return "Donation id: " + donationId + "\n"
                + "Donor id: " + donorId + "\n"
                + "Donation description: " + donationDescription + "\n"
                + "Donation amount: " + donationAmount + "\n"
                + "Donation date: " + donationDate + "\n"
                + "Tax deductible: " + taxDeductible + "\n";
    }
}
