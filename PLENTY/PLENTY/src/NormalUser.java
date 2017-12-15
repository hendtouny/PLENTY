import java.util.Scanner;
import java.util.Vector;


public class NormalUser extends User{
	
	public Cart MyCart;
	public NormalUser() 
    {
		MyCart=new Cart();
	
    }
    public NormalUser(String name,String email,String pass , String add) 
     {

    	UserName=name;
        Email=email;
        Password=pass;
        Address=add;
        MyCart=new Cart();


     }
    public NormalUser(NormalUser n) 
    {

   	this.UserName=n.UserName;
       this.Email=n.UserName;
       this.Password=n.Password;
       this.Address=this.Address;
       this.MyCart=n.MyCart;
       


    }
    public void AddToCart(Product p)
    {
    	System.out.println("Enter The Quantity you want from From "+ p.getName());
    	Scanner n=new Scanner(System.in);
    	int quantity=n.nextInt();
    	this.MyCart.ProductQuantity.add(quantity);
    	this.MyCart.Products.add(p);
    	
    	
    }

}
