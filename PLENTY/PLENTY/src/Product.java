import java.util.*;
import java.util.Vector;

public class Product {
	

    private String Name;
    private double Price;
    private String Category;
    private Brand brand;
    private String Type;
    private int ID;
    public Vector<Store> stores;

    public Product() {
    	Name = "";
    	Price = 0.0;
    	Category = "";
    	brand = new Brand();
    	Type = "";
    	ID = 0;
    	stores = new Vector <Store>();
    }
    public Product(String n, double p, String c, String t,Brand b, int id, Vector<Store> s){
    	Name = n;
    	Price = p;
    	Category = c;
    
    	ID = id;
    	this.brand=b;
    	
    	stores = new Vector<Store>();
      	for(int i=0;i<s.size();i++)
      	{
      		stores.add(s.get(i));
      	}
    }
      	public Product(String n, double p, String c,Brand b, String t, int id){
        	Name = n;
        	Price = p;
        	Category = c;
        	Type = t;
        	ID = id;
        	brand=b;
        	
        	stores = new Vector<Store>();
          	
      	
    }
/*public Product(Product p)
{
	this.brand=p.brand;
	this.Category=p.Category;
	this.ID=p.ID;
	this.Name=p.Name;
	this.Price=p.Price;
	this.Type=p.Type;
	this.stores = new Vector<Store>();
	for(int i=0;i<p.stores.size();i++)
	{
		this.stores.add(p.stores.get(i));
	}
}
*/

    public void setName(String name) {
        name = this.Name;
    }
    
    public void setPrice(double price) {
        price = this.Price;
    }

    public void setCategory(String category) {
        category = this.Category;
    }

    public void setType(String type) {
        type = this.Type;
    }

    public void setID(int id) {
    	id = this.ID;
      
    }

   
    public String getName() {
        return this.Name;
    }

    public double getPrice() {
        return this.Price;
    }

    public String getCategory() {
       
        return this.Category;
    }

    public String getType() {
        
        return this.Type;
    }

    public int getID() {
        return this.ID;
    }

    public void getSuggestion() {
        
    }

}