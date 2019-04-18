/**** This class defines the blueprint of a family member  
 **** A family member has a first name, a last name, and a number of siblings 
 **** The code is given to you: you MUST NOT modify it.
 ****/

public class FamilyMember {
    private String fname;
    private String lname;
    private int siblings;
    
    public FamilyMember() {}
    
    public FamilyMember(String fn, String ln, int s) {
        fname = fn;
        lname = ln;
        siblings = s;
    }

    public void setFName(String fn) {
        fname = fn;
    }
    
    public void setLName(String ln) {
        lname = ln;
    }
    
    public void setSiblings(int s) {
        siblings = s;
    }
    
    public String getFName() {
        return fname;   
    }
    
    public String getLName() {
        return lname;   
    }
    
    public int getSiblings() {
        return siblings;   
    }
    
    public String toString() {
        return fname + " " + lname + ", who had: " + siblings + " siblings.";   
    }
}