import java.util.Scanner;
import java.util.Vector;


public class Main {

	public static Vector <StoreOwner> Owners;
	public static Vector <NormalUser> normal;
	public static Vector <Product> Products;
	public static Vector <Brand> Brands;
	public static Vector <Product> Products_Sugg;
	public static Vector <Brand> Brands_Sugg;
	public static Vector <VoucherCard> VoucherCards;
	
	public static void main(String[] args) {
		 Owners=new Vector<StoreOwner>();
		 normal=new Vector<NormalUser>();
		 Products=new Vector<Product>();
		 Brands=new Vector<Brand>();
		 Products_Sugg=new Vector <Product>();
		 Brands_Sugg=new Vector <Brand> ();
		 VoucherCards=new Vector<VoucherCard>();
		 Payment pay=new Payment();
		 BrandController Brand_Control=new BrandController();
		// StoreController Store_Control=new StoreController();
		 VoucherController Voucher_Control=new VoucherController();
		 
		 
		
		///////////////////////////////////////////////
		//Initial Owners 
		StoreOwner S1=new StoreOwner("Omnya", "omnya@gmail", "1234", "Cairo");
		Owners.add(S1);
		StoreOwner S2=new StoreOwner("Sara", "sara@gmail", "4567", "Giza");
		Owners.add(S2);
		StoreOwner S3=new StoreOwner("Muhammed", "muhammed@gmail", "8910", "Alex");
		Owners.add(S3);
		StoreOwner S4=new StoreOwner("Hend", "hend@gmail", "57hj", "cairo");
		Owners.add(S4);
		StoreOwner S5=new StoreOwner("Layla", "layla@gmail", "killbill", "RAK");
		Owners.add(S5);
		StoreOwner S6=new StoreOwner("Amany", "amany@gmail", "knock", "Dubai");
		Owners.add(S6);
		/////////////////////////////////////////////////
		// Initial Normal User 
		NormalUser N1=new NormalUser("Ahmed", "Ahmes@gmail", "hamada", "Cairo");
		normal.add(N1);
		NormalUser N2=new NormalUser("Salma", "salma@gmail", "9000", "Giza");
		normal.add(N2);
		NormalUser N3=new NormalUser("Ismail", "ismail@gmail", "5000", "Alex");
		normal.add(N3);
		NormalUser N4=new NormalUser("Hany", "hany@gmail", "hany34", "cairo");
		normal.add(N4);
		NormalUser N5=new NormalUser("Nahla", "nahla@gmail", "nahola", "Cairo");
		normal.add(N5);
		NormalUser N6=new NormalUser("Fatma", "Fatma@gmail", "fatoma33", "Dubai");
		normal.add(N6);
		////////////////////////////////////////////////
	    //initial vouchers
		VoucherCard V1=new VoucherCard(01, 500);
		VoucherCards.add(V1);
		VoucherCard V2=new VoucherCard(02, 400);
		VoucherCards.add(V2);
		VoucherCard V3=new VoucherCard(03, 550);
		VoucherCards.add(V3);
		VoucherCard V4=new VoucherCard(04, 1000);
		VoucherCards.add(V4);
		VoucherCard V5=new VoucherCard(05, 50);
		VoucherCards.add(V5);
		VoucherCard V6=new VoucherCard(06, 600);
		VoucherCards.add(V6);
		////////////////////////////////////////////////
		//initial vouchers
		Brand B1 = new Brand("Puma", 201, "Puma");
		Brands.add(B1);
		Brand B2 = new Brand("Wala benkhaf", 202, "Wala benkhaf");
		Brands.add(B2);
		Brand B3 = new Brand("Tornado", 203, "Tornado");
		Brands.add(B3);
		Brand B4 = new Brand("calvin Klein", 204, "Calvin klein");
		Brands.add(B4);
		Brand B5 = new Brand("Mcafee", 205, "Mcafee");
		Brands.add(B5);
		Brand B6 = new Brand("FEMINA", 206, "FEMINA");
		Brands.add(B6);
		Brand B7 = new Brand("NIKE", 207, "NIKE");
		Brands.add(B7);
		Brand B8 = new Brand("adidas", 208, "adidas");
		Brands.add(B8);
	
		/////////////////////////////////////////////////////
		Product P1=new Product("Sneakers", 1025, "Shoes", B1,"Normal", 101);
		Products.add(P1);
		Product P2=new Product("Kamanana", 80, "Food", B2,"Normal", 102);
		Products.add(P2);
		Product P3=new Product("Split Air Conditional", 7500, "Appliances", B3,"Normal",  103);
		Products.add(P3);
		Product P4=new Product("City Watch", 5000, "Watch",B4,"Normal", 104);
		Products.add(P4);
		Product P5=new Product("Mcafee Antivirus Plus", 70, "Antivirus",B5, "Online",  105);
		Products.add(P5);
		Product P6=new Product("Meyamayo", 500, "Dress",B6, "Normal",  106);
		Products.add(P6);
		
		Register R=new Register();
		System.out.println("Do you want to '1' sign up or '2' Log in ? ");
	    Scanner n=new Scanner(System.in);
	    int Choice=n.nextInt();
	    switch(Choice)
	    {
	    case 1 :
	    {
	    	System.out.println("Do you want to sign in as '1'a Store Owner or '2' Normal User ?");
	    	Scanner x=new Scanner(System.in);
		    int C=x.nextInt();
		    if(C==1)
		    {
		    	System.out.println("Enter Name ");
			    Scanner a=new Scanner(System.in);
			    String name =n.nextLine();
			    System.out.println("Enter pass ");
			    Scanner b=new Scanner(System.in);
			    String pass=b.nextLine();
			    System.out.println("Enter Email ");
			    Scanner c=new Scanner(System.in);
			    String Email =c.nextLine();
			    System.out.println("Enter Address ");
			    Scanner d=new Scanner(System.in);
			    String address =d.nextLine();
			    
		    StoreOwner S=R.RegisterStoreOwner(name, pass, Email, address, Owners);
		    }
		    else
		    {

		    	System.out.println("Enter Name ");
			    Scanner a=new Scanner(System.in);
			    String name =n.nextLine();
			    System.out.println("Enter pass ");
			    Scanner b=new Scanner(System.in);
			    String pass=b.nextLine();
			    System.out.println("Enter Email ");
			    Scanner c=new Scanner(System.in);
			    String Email =c.nextLine();
			    System.out.println("Enter Address ");
			    Scanner d=new Scanner(System.in);
			    String address =d.nextLine();
			    
		    NormalUser N=R.RegisterNormalUser(name, pass, Email, address, normal);
		    	
		    }
	    	break;
	    }
	    case 2:
	    {
	    	System.out.println("Do you want to Log in as a '1' Store Owner '2' Normal User ");
	    	Scanner x=new Scanner(System.in);
		    int C=x.nextInt();
		    switch (C)
		    {
		    case 1:
		    {

		    	System.out.println("Enter Name ");
			    Scanner a=new Scanner(System.in);
			    String name =n.nextLine();
			    System.out.println("Enter pass ");
			    Scanner b=new Scanner(System.in);
			    String pass=b.nextLine();
			    R.LogInAsStoreOwner(name, pass, Owners);
		    	break;
		    }
		    case 2:
		    {
		    	System.out.println("Enter Name ");
			    Scanner a=new Scanner(System.in);
			    String name =n.nextLine();
			    System.out.println("Enter pass ");
			    Scanner b=new Scanner(System.in);
			    String pass=b.nextLine();
			    System.out.println("Enter Email ");
			    Scanner c=new Scanner(System.in);
			    String Email =c.nextLine();
			    R.LogInAsNormal(name, pass, normal);
		    	break;
		    }
		    }
	    }
	    
	    }
	    
	}

}
