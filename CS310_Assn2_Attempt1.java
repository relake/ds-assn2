/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs310_assn2_attempt1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ragan E. Lake
 */
public class CS310_Assn2_Attempt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        CashImplementation cashImpl = new CashImplementation();
        PropertyImplementation propImpl = new PropertyImplementation();
        DonorImplementation donorImpl = new DonorImplementation();
        PrintImplementation printImpl = new PrintImplementation();
        
        Scanner fileScanner=null;
        File inFile = new File ("donations.csv");
        
        try {
            fileScanner = new Scanner (inFile);  
        } catch (FileNotFoundException fnfe) { 
            System.err.println("Failed to open file " + inFile);           
        }
        
        int sizeOfList=100;
        String [] inputArray = new String[sizeOfList];
        
        while (fileScanner.hasNextLine() ){            
            String inputLine = fileScanner.nextLine();
   
            inputArray = inputLine.split(",");
    
                    String type = (inputArray[0]); 
                    if (type.equalsIgnoreCase ("DONOR")) {
                        int donorId = Integer.parseInt(inputArray[2]);
                        String firstName = inputArray[3];
                        String lastName = inputArray[4];
                        String email = inputArray[5];
                        String phone = inputArray[6];
                        Donor oneDonor = new Donor (donorId, firstName, lastName,email, phone);
                        if (oneDonor.equals(donorId)) {      
                            if (!(oneDonor.checkEmail(email))) {
                                System.out.println("The email is invalid " + oneDonor.toString());
                            }
                            donorImpl.add(oneDonor);
                        } else {
                            System.out.println("That donor already exists.");
                        }     
                    } else if (type.equalsIgnoreCase ("CASH")){
                        String action = inputArray[1]; 
                        int donationId = Integer.parseInt(inputArray[2]);
                        int donorId = Integer.parseInt(inputArray[3]);
                        String donationDescription = inputArray[4];
                        double donationAmount = Double.parseDouble(inputArray[5]);
                        String donationDate = inputArray[6];
                        String isDeductible = inputArray[7];       
                        int checkNumber = Integer.parseInt(inputArray[8]);
                        CashDonation cashDonation = new CashDonation (donationId, donorId, donationDescription, donationAmount, donationDate, isDeductible, checkNumber);               
                        cashImpl.add(cashDonation);
                        if (!(cashDonation.validateCheckNumber(checkNumber))) {
                           System.out.println("Check number " + checkNumber + " for " + cashDonation.toString() + " is not valid.");
                           System.out.println();    
                        } if (!(cashDonation.equals(donationId))) {
                            System.out.println("This donation, donation id #" + donationId + ", already exists.");
                            System.out.println();  
                        }             
                    } else if (type.equalsIgnoreCase("PROPERTY")) {
                        String action = inputArray[1]; 
                        int donationId = Integer.parseInt(inputArray[2]);
                        int donorId = Integer.parseInt(inputArray[3]);
                        String donationDescription = inputArray[4];
                        double donationAmount = Double.parseDouble(inputArray[5]);
                        String donationDate = inputArray[6];
                        String isDeductible = inputArray[7]; 
                        boolean appraisalPerformed = Boolean.parseBoolean(inputArray[8]);
                        PropertyDonation propertyDonation = new PropertyDonation (donationId, donorId, donationDescription, donationAmount, donationDate, isDeductible, appraisalPerformed);
                        if (!(propertyDonation.equals(donationId))) {
                            System.out.println("This donation, donation id #" + donationId + ", already exists.");
                            System.out.println();  
                        }  
                        propImpl.add(propertyDonation);
                    }
        
 
        }
       System.out.println(cashImpl.getCashDonationList());
        System.out.println(propImpl.getPropertyDonationList());
        System.out.println();
        printImpl.printReport(donorImpl, cashImpl, propImpl);
    fileScanner.close(); 
    }
}
             
    

