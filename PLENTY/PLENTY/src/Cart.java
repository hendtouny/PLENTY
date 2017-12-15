import java.util.*;
//java.math.BigDecimal.multiply();

public class Cart {

    public Cart()
    {
    	 Products= new Vector<Product>();
         ProductQuantity =new Vector() ;
         this.Price=0;

    }
    public Cart(int ID , Vector<Product>p, Vector<Integer> q)
    {
    	this.CartID=ID;
    	this.Price=0;
       
        for(int i=0 ;i<p.size();i++)
        {
          this.Products.add(p.get(i));
        }
        for(int i=0 ;i<q.size();i++)
        {
          this.ProductQuantity.add(q.get(i));
        }
       
    }
    public Cart(Cart c)
    {
    	this.CartID=c.CartID;
    	this.Price=c.Price;
    	for(int i=0;i<c.ProductQuantity.size();i++)
    	{
    		this.ProductQuantity.add(c.ProductQuantity.get(i));
    		
    	}
    	for(int i=0;i<c.Products.size();i++)
    	{
    		this.Products.add(c.Products.get(i));
    		
    	}
    }

    private int CartID;
    public Vector<Product> Products;
    private double Price;
    public Vector <Integer>ProductQuantity ;

    
    public void setCardID(int cardid) 
    {
        this.CartID=cardid;
    }
    public int getCardID() 
    {
       return this.CartID;
    }
   
    public double CalculatePrice() 
    {
    	float TotalPrice=0;
    	if(this.Products.size()==this.ProductQuantity.size())
    	{
            for(int i=0;i<this.Products.size();i++)
            {
            	TotalPrice+= Products.get(i).getPrice() *ProductQuantity.get(i);
            }

    	}
    	this.Price=TotalPrice;
    	return TotalPrice;
    }

    public void ClearCart(Cart c) {
        for(int i=0;i<this.ProductQuantity.size();i++)
        {
        	ProductQuantity.clear();
        }
        for(int i=0;i<this.Products.size();i++)
        {
        	Products.clear();
        }
        this.Price=0.0;
    }
    public double getPrice() {
        return this.Price;
    }

}