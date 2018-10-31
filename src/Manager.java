// Description: The Manager class describes information about the departure or 
// arrival of a project.

public class Manager 
{
    // attributes for a manager
    private String firstName; 
    private String lastName; 
    private int deptNum; 
    
    // constructor that initilizes manager's attributes
    public Manager()
    {
        firstName = "?";
        lastName = "?"; 
        deptNum = 0; 
    }
    
    // accessor method that gets firstName attribute
    public String getFirstName()
    {
        return firstName;
    }
    
    // accessor method that gets lastName attribute
    public String getLastName()
    {
        return lastName; 
    }
    
    // accessor method that gets deptNum attribute
    public int getDeptNum()
    {
        return deptNum;
    }
    
    // mutator method that assigns a value to firstName 
    public void setFirstName(String someFirstName)
    {
        firstName = someFirstName; 
    }
    
    // mutator method that assigns a value to lastName 
    public void setLastName(String someLastName)
    {
        lastName = someLastName; 
    }
    
    // mutator method that assigns a value to deptNum
    public void setDeptNum(int someDeptNum)
    {
        deptNum = someDeptNum;
    }
    
    // toString() returns manager's attributes along with relevant descriptors 
    // and proper spacing
    @Override // since Project has a toString() method
    public String toString()
    {
        String str = firstName + " " + lastName + ", Dept Num:" + deptNum; 
        return str; 
    }
}