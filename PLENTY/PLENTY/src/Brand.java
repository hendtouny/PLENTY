
import java.util.*;


public class Brand {
    
    private String Name;
    private int ID;
    private String CompanyName;
    
    public Brand() {
    	Name = "";
    	ID = 0;
    	CompanyName = "";
    }
    public Brand (String n , int id, String con){
    	Name = n ;
    	ID = id ;
    	CompanyName = con;
    }
    public Brand (Brand b){
    	this.CompanyName=b.CompanyName;
    	this.ID=b.ID;
    	this.Name=b.Name;
    }

    public void setName(String name) {
        
        name = this.Name;
    }
    public void setID(int id) {
        
        id = this.ID;
    }
    public void setCompanyname(String coname) {
        
       coname = this.CompanyName;
    }
    public String getName() {
        
        return this.Name;
    }
    public int getID() {
        
        return this.ID;
    }
    public String getCompanyname() {
        
        return this.CompanyName;
    }

}
