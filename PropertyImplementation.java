package cs310_assn2_attempt1;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ragan E. Lake
 */
public class PropertyImplementation implements TotalsIdInterfaceI {
    
    List<PropertyDonation>propertyDonationList=new ArrayList<>();
 
//Returns count of donations in list.
     
     public int getNumberOfDonations () {
         int numberOfDonations = 0; 
         for (PropertyDonation oneDonation:propertyDonationList) {
             numberOfDonations++;
         }
         return numberOfDonations;
     }
     
     //Returns count of donations with donorID.
     
     public int getNumberOfDonations (int donorId) {
         int numberOfDonations = 0;
         for (PropertyDonation onePropertyDonation:propertyDonationList) {
             if (donorId==onePropertyDonation.getDonorId()) {
                numberOfDonations++;
            } 
         }
        return numberOfDonations; 
     }
     
     //Returns sum of donations in list.
     
     public double getAmountOfDonations (){
         double totalDonationAmount=0;
         for (PropertyDonation oneDonation:propertyDonationList) {
             totalDonationAmount += oneDonation.getDonationAmount();
         }
         return totalDonationAmount;
     }
     
     //Returns sum of donations with donorID.
     
//     public double getAmountOfDonations(int donorId) {
//         float totalDonationAmount = 0;    
//         for (PropertyDonation onePropertyDonation:propertyDonationList) {
//             if (donorId==onePropertyDonation.getDonorId()) {
//                 String donationAmount = onePropertyDonation.getDonationAmount();
//                 double convertedDonationAmount = Double.parseDouble(donationAmount);
//                 totalDonationAmount += convertedDonationAmount;
//             }
//         } return totalDonationAmount;
//     }
     
     //Adds donation to list.
     
     public boolean add (Object obj) {
        PropertyDonation propertyDonation = (PropertyDonation)obj;
        return (propertyDonationList.add(propertyDonation));   
     }
     
     //Removes donation from list.
     
     public boolean remove (Object obj){
         PropertyDonation propertyDonation = (PropertyDonation)obj;
         return (propertyDonationList.remove(propertyDonation));
     }
     
     //Removes donation with a specified donorID from list.
     
     public boolean remove (int donorId) {
         for (PropertyDonation onePropertyDonation:propertyDonationList){
             donorId=onePropertyDonation.getDonorId();
         }
         return false;
     }
     
     //Tests if donation with ID exists in list.
     
     public boolean isIDUnique (int donationID) {
         for (PropertyDonation onePropertyDonation:propertyDonationList){
            donationID = onePropertyDonation.getDonationId();
            if (donationID != onePropertyDonation.getDonationId()) {
                return true;
            }
        } return false;
     }

   public List<PropertyDonation> getPropertyDonationList() {
        return propertyDonationList;
    }

    @Override
    public double getAmountOfDonations(int donorID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
