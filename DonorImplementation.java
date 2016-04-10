/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs310_assn2_attempt1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ragan E. Lake
 */
public class DonorImplementation implements IdInterface {
 List<Donor>donorList=new ArrayList<>();
    
    //Adds a donor to an ordered list.
    
    public boolean add (Object obj) {
         Donor donor = (Donor)obj;
         return (donorList.add(donor));
     }
    
    //Removes a donor from the list. 
     public boolean remove (Object obj) {
         Donor donor = (Donor)obj;  
         return (donorList.remove(donor));
         
     }
     
     //Removes donor with a specified donorId from the list.
     public boolean remove (int donorId) {
         for (Donor oneDonor:donorList) {
             donorId =oneDonor.getDonorId();
         }
         return false;
     
     }
     
     //Tests if donor with ID exists in list.
     public boolean isIDUnique (int donorId) {
        for (Donor oneDonor:donorList) {
             donorId =oneDonor.getDonorId();
             if (donorId != oneDonor.getDonorId()){
                 return true;
             }        
    } return false;
}


    public void setDonorList(ArrayList<Donor> donorList) {
        this.donorList = donorList;
    }   

    public List<Donor> getDonorList() {
        return donorList;
    }
    
    
}
