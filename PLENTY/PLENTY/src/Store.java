import java.util.*;
import java.util.Vector;
public class Store {

  
    public Store() {
    	Name = "";
    	Address = "";
    	products = new Vector <Product> () ;
    	
    }
    public Store(String n, String ad, Vector<Product> p){
    	Name = n;
    	Address = ad;
    	
    	products = new Vector<Product>();
      	for(int i=0;i<p.size();i++)
      	{
      		products.add(p.get(i));
      	}
    	
    }
    public Store(Store s)
    {
    	this.Address=s.Address;
    	this.Name=s.Name;
    	this.owner=s.owner;
    	this.products = new Vector <Product> () ;
    	for(int i=0 ;i<s.products.size();i++)
    	{
    		this.products.add(s.products.get(i));
    	}
    }

    private String Name;
    private String Address;
    public StoreOwner owner;
    public Vector <Product> products;


    public void setName(String name) {
        name = this.Name ;
    }

    public void setAddress(String address) {
    	address = this.Address;
    }

    public String getName() {
        return this.Name;
    }

    public String getAddress() {
        
        return this.Address;
    }

}