/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs310_assn2_attempt1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ragan E. Lake
 */
public class PrintImplementation {
     List<CashDonation>cashDonationList;
     List<PropertyDonation>propertyDonationList;
     List<Donor>donorList;
     
     public void printReport (DonorImplementation donorImpl,CashImplementation cashImpl, PropertyImplementation propImpl)  {  
  
        cashDonationList = cashImpl.getCashDonationList();
        propertyDonationList = propImpl.getPropertyDonationList();
        donorList = donorImpl.getDonorList();
        
        float GOLDSTAR = 10000;
        double totalDonorCashDonations = 0;
        int numberCashDonations = 0;
        int numberPropertyDonations = 0;
        double donorCashDonationAmount= 0;
        double donorPropertyDonationAmount=0;
        int donorNumberCashDonations = 0;
        int donorNumberPropertyDonations = 0;
        double totalDonorDonationsAmount = 0;
      
//        PrintWriter fstream = new PrintWriter ("out.txt");
        try {
            PrintWriter fstream = new PrintWriter ("out.txt");  
        } catch (FileNotFoundException fnfe) { 
            System.err.println("Failed to create file ");           
        }
          
        for (Donor currDonor:donorList) {
              
            System.out.println("Donor ID, Donor Last Name, Donor First Name, GOLDSTAR(display if true");
            int idNumber=currDonor.getDonorId();
            String lastName = currDonor.getLastName();
            String firstName = currDonor.getFirstName();
            System.out.println(idNumber + lastName + firstName);

            System.out.println("Cash Donations");
            
            for (CashDonation currCashDonation:cashDonationList) {
             
                if (currCashDonation.getDonorId() == currDonor.getDonorId()) {
                    int donationId = currCashDonation.getDonationId();
                    String donationDate = currCashDonation.getDonationDate();
                    String donationDescription = currCashDonation.getDonationDescription();
                    double donationAmount = currCashDonation.getDonationAmount();
                    int donationCheckNumber = currCashDonation.getCheckNumber();
                    String taxDeductible = currCashDonation.getTaxDeductible();
                    donorCashDonationAmount = cashImpl.getAmountOfDonations();
                    donorNumberCashDonations = cashImpl.getNumberOfDonations();
                
                System.out.printf(donationId + donationDate + donationDescription + donationAmount + donationCheckNumber + taxDeductible);
                        if (currCashDonation.getTaxDeductibleTrue()) {
                            System.out.printf(taxDeductible);
                        }
            }
            
            System.out.println("Property Donations");
            
            for (PropertyDonation currPropertyDonation:propertyDonationList) {
              
                if (currPropertyDonation.getDonorId() == currDonor.getDonorId()) {
                    int donationId = currPropertyDonation.getDonationId();
                    String donationDate = currPropertyDonation.getDonationDate();
                    String donationDescription = currPropertyDonation.getDonationDescription();
                    double donationAmount = currPropertyDonation.getDonationAmount();
//                    String appraisalPerformed = currPropertyDonation.getAppraisalPerformed();
                    String taxDeductible = currPropertyDonation.getTaxDeductible();
                    donorPropertyDonationAmount = propImpl.getAmountOfDonations();
                    donorNumberPropertyDonations = propImpl.getNumberOfDonations();
                
                    System.out.printf(donationId + donationDate + donationDescription + donationAmount + taxDeductible);
                        if (currPropertyDonation.checkAppraisalPerformed()) {
//                            System.out.printf(appraisalPerformed);
                        }
            }
                
            totalDonorDonationsAmount = donorPropertyDonationAmount + donorCashDonationAmount;    
            if (totalDonorDonationsAmount > GOLDSTAR ){
                            System.out.printf("GOLDSTAR");
            }  
        }
                int totalDonationNumber = donorNumberCashDonations + donorNumberPropertyDonations;
                double totalDonationAmount = donorCashDonationAmount + donorPropertyDonationAmount;
                
                System.out.println("Total Cash Donations = " + numberCashDonations);
                System.out.println("Total Cash Donation Amount = " + donorCashDonationAmount);
                System.out.println("Total Property Donations = " + numberPropertyDonations);
                System.out.println("Total Property Donation Amount = " + donorPropertyDonationAmount);
                System.out.println("Total Donations = " + totalDonationNumber);
                System.out.println("Total Donations Amount = " + totalDonationAmount);                                   
        }
    }
//     fstream.close();
   }
}

