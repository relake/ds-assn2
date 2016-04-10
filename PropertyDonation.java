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
public class PropertyDonation extends Donation{
    
    private boolean appraisalPerformed;
    
    /**Construct a property donation with the given values
     * 
     * @param donationId - ID number of the donation
     * @param idOfDonor - ID number of the donor
     * @param donDescription - description of the donation
     * @param donAmt - amount of the donation
     * @param dateOfDonation - date of the donation
     * @param deductible  - whether the donation is tax deductible
     * @param appraisal - whether an appraisal of the property was performed
     */
    
    public PropertyDonation(int donationId, int idOfDonor, String donDescription, double donAmt, String dateOfDonation, String deductible, boolean appraisal) {
        super(donationId, idOfDonor, donDescription, donAmt, dateOfDonation, deductible);
        appraisalPerformed=appraisal;
    }
        
    /**Validates that an appraisal has been performed on a donation of property.
     * 
     * @return true if an appraisal has been performed, false if it is has not.
     */
    
    public boolean checkAppraisalPerformed () {
        if (appraisalPerformed == true) {
            return true;
        } else {
            return false;
        }
    }

    /**Gets the value of whether an appraisal has been performed on a property donation.
     * 
     * return true if an appraisal has been performed, false if it has not.
     */
    public boolean isAppraisalPerformed() {
        return appraisalPerformed;
    }

    /**Sets the value to true or false depending upon whether an appraisal has been performed.
     * 
     * @param appraisalPerformed - whether an appraisal has been performed. 
     */
    
    public void setAppraisalPerformed(boolean appraisalPerformed) {
        this.appraisalPerformed = appraisalPerformed;
    }

    @Override
    public String toString() {
        return super.toString() + "PropertyDonation{" + "appraisalPerformed=" + appraisalPerformed + '}';
    }

}
