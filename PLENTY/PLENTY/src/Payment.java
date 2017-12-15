import java.util.*;


public class Payment {

  /// VoucherController control; ana shelto 34an 7set lama ab3ato fe function more logical 
    public Payment() 
    {
    	
    }

  
    //public DataBase DB;

   
   // public VoucherController Control_V;


    /*public void CheckOut(Cart C, Visa V) {
        // TODO implement here
        return null;
    }

     */
    public void CheckOut(Cart C) 
    {
        
      double Price= C.CalculatePrice();
      System.out.print("The Total Cash Amount Is : " + Price + " L.E ");
    }

   
    public void CheckOut(Cart C, VoucherCard Voucher,VoucherController V)
    {
    	double Price ;
    	boolean  check= V.CheckExist(Voucher,Main.VoucherCards);
        
        if(check==true)///not found in the array elli ha7ot feh el vouchers elli m-create-aha then it `s ok 
        {
        	if(C.CalculatePrice()<=Voucher.getValue())
        	{
        		Price=0.0;
        		System.out.print("The Total Amount after Didcounting voucher value is  : "+Price+ " L.E");
        		
        	}
        	else
        	{
	        Price =C.CalculatePrice()-Voucher.getValue();
	        
	        System.out.print("The Total Amount after Didcounting voucher value is  : "+Price+ " L.E");
        	}
        }
        else
        {
        	System.out.print("OOPS !! The Voucher Card is not valid "+"\n");
        	Price =C.CalculatePrice();
        	System.out.print("The Total Amount you should pay is  : "+Price +" L.E");
        }
        
        
        
    }


    public Cart GetCart(NormalUser U, NormalUser array []) //ana 8ayart el User U to Normal User 34an 7war el abstract class
    {
    	Cart user_cart = null;
           for(int i=0;i<array.length;i++)
           {
        	   if(U.MyCart.getCardID()==array[i].MyCart.getCardID())
        	   {
        		   user_cart=array[i].MyCart;
        	   }
           }
    	
        return user_cart;
    }

}