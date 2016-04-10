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
public class Donor {
    /**First name of donor*/
    private String firstName;
    /**Last name of donor*/
    private String lastName;
    /**ID number of donor*/
    private int donorId;
    /**Phone number of donor*/
    private String phoneNumber;
    /**Email address of donor*/
    private String emailAddress;
        
    /**Construct a donor with given values
     * @param first - the first name of the donor
     * @param last - the last name of the donor
     * @param donorId - the ID of the donor
     * @param telephone - the telephone number of the donor
     * @param email  - the email address of the donor
     */
    public Donor(int donorId, String first, String last, String telephone, String email) {
       firstName=first;
       lastName=last;
       this.donorId=donorId;
       phoneNumber=telephone;
       emailAddress=email;
    }
    
    /**Sets the first name field.
     * 
     * @param nameFirst - the first name of the donor 
     */
    public void setFirstName(String nameFirst) {
        firstName=nameFirst;
    }
    
    /**Sets the last name field.
     * 
     * @param nameLast - the last name of the donor 
     */
    public void setLastName (String nameLast) {
        lastName = nameLast;
    }
    
    /**Sets the phone number of the donor.
     * 
     * @param telNo - - the telephone number of the donor
     */
    public void setPhoneNumber (String telNo) {
        phoneNumber=telNo;
    }
    
    /**Sets the email address of the donor.
     * 
     * @param eAddress - the email address of the donor
     */
    public void setEmailAddress (String eAddress) {
        emailAddress = eAddress;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }
    
    /**Get the first name of the donor.
     * 
     * @return the first name of the donor as a string
    */
    public String getFirstName () {
        return firstName;
    }
    
    /**Get the last name of the donor.
     * 
     * @return the last name of the donor as a string
     */
    public String getLastName () {
        return lastName;
    }
    
    /**Get the phone number of the donor.
     * 
     * @return the phone number of the donor as a string 
     */
    
    public String getPhoneNumber () {
        return phoneNumber;
    }
    
    /**Get the email address of the donor.
     * 
     * @return - the email address of the donor as a string 
     */
    
    public String getEmailAddress () {
        return emailAddress;
    }
    
    /**Get the ID number of the donor.
     * 
     * @return - the ID number of the donor as a string
     */
    
    /**Retrieves the information in a Donor object.
     * 
     * @return the object state as a string 
     */
    
    public String toString() {
        return "First name: " + firstName + "\n"
                + "Last name: " + lastName + "\n"
                + "Phone number: " + phoneNumber + "\n"
                + "Email address: " + emailAddress + "\n"
                + "Donor ID: " + donorId + "\n";
    }
    
    /**Compares two Donor objects for equality.
     * 
     * @param don - the second Donor object
     * @return true if the Donor objects have same ID number; false if they don't
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Donor other = (Donor) obj;
        if (this.donorId != other.donorId) {
            return false;
        }
        return true;
    }
 
    /**Checks that the email of a donor is valid by confirming that the character "@" is present.
     * 
     * @param email - email of the donor to be checked.
     * @return true if the email contains "@", false if it does not.
     */
    
    public static boolean checkEmail(String email) {
        if (email.contains(Character.toString('@'))) { 
        return true;
        } else {
        return false;
        }

    }
            
   
}
