import java.util.Vector;

public class ProductController {
	
	public static Boolean CheckExist (Product pr, Vector<Product> prs) {
		for(int i=0;i<prs.size();i++) {
			if(pr.getID()==prs.get(i).getID())
				return true;
		}
		
		return false;
	}	
	
	public static Boolean AddProduct (Product pr){
		if(CheckExist(pr, Main.Products)==false) {
			Main.Products.add(pr);
			System.out.println("The Product '"+pr.getName()+"' has been Succesfully Added to the Platform");
			return true;           
		}
		System.out.println("The Product '"+pr.getName()+"' already exists on the platform");
		return false;
		
	}
	public static Boolean DeleteProduct (Product pr) {
		if(CheckExist(pr, Main.Products)==true) {
			Main.Products.remove(pr);
			System.out.println("The Product "+pr.getName()+" has been Succesfully Deleted from the Platform");
			return true;           
		}
		System.out.println("The Products '"+pr.getName()+"' doesn't exists on the platform");
		return false;
	}
	public static Boolean RejectProduct (Product pr) {
		if(CheckExist(pr, Main.Products_Sugg)==true) {
			Main.Products_Sugg.remove(pr);
			System.out.println("The Product Suggestion '"+pr.getName()+"' has been Succesfully Rejcected");
			return true;
		}
		System.out.println("The Product Suggestion '"+pr.getName()+"' doesn't exists");
		return false;
	}
	public static Boolean ApproveProduct (Product pr) {
		if(CheckExist(pr, Main.Products_Sugg)==true) {
			Main.Products_Sugg.remove(pr);
			Main.Products.add(pr);
			System.out.println("The Product Suggestion '"+pr.getName()+"' has been Succesfully Approved");
			return true;
		}
		System.out.println("The Product Suggestion '"+pr.getName()+"' doesn't exists");
		return false;
	}
	
	
}