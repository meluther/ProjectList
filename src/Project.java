// Description: The Project class describes a project within an institution.

public class Project 
{
    // attributes for a project
    private String projTitle;
    private int projNumber;
    private String projLocation;
    private Manager projManager; // indicative of aggregation relationship
    
    // constructor that initilizes project's attributes
    public Project()
    {
        projTitle = "?"; 
        projNumber = 0; 
        projLocation = "?"; 
        projManager = new Manager(); // instantiation of a new manager object
    }
    
    // accessor method that gets projTitle attribute
    public String getProjTitle()
    {
        return projTitle;
    }
    
    // accessor method that gets projNumber attribute
    public int getProjNumber()
    {
        return projNumber;
    }
    
    // accessor method that gets projLocation attribute
    public String getProjLocation()
    {
        return projLocation; 
    }
    // accessor method that gets projManager class level variable
    public Manager getProjManager()
    {
        return projManager; 
    }
    
    // mutator method that assigns a value to projTitle 
    public void setProjTitle(String aTitle)
    {
        projTitle = aTitle;
    }
    
    // mutator method that assigns a value to projNumber
    public void setProjNumber(int number)
    {
        projNumber = number;
    }
    
    // mutator method that assigns a value to projLocation
    public void setProjLocation(String aLocation)
    {
        projLocation = aLocation;
    }  
    
    // mutator method that assigns values to projManager's attributes
    public void setProjManager(String someFirstName, String someLastName, int 
            someDeptNum)
    {
        projManager.setFirstName(someFirstName); // must access attributes via Manager's mutator methods
        projManager.setLastName(someLastName); 
        projManager.setDeptNum(someDeptNum); 
    }
    
    // toString() returns project's attributes along with relevant descriptors 
    // and proper spacing
    @Override // since Manager has a toString() method
    public String toString()
    {
        String str = "\nProject Title:\t\t" + projTitle + "\nProject Number:\t\t" 
                + projNumber + "\nProject Location:\t" + projLocation + "\n"
                + "Project Manager:\t" + projManager + "\n\n"; 
        return str; 
    }
}
