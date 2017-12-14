import java.util.Vector;

public class BrandController {
			
	
	public static Boolean CheckExist (Brand br, Vector<Brand> brs) {
		for(int i=0;i<brs.size();i++) {
			if(br.getID()==brs.get(i).getID())
				return true;
		}
		return false;
	}	
	public static Boolean AddBrand (Brand br){
		if(CheckExist(br, Main.Main.Brands)==false) {
			Main.Brands.add(br);
			System.out.println("The Brand '"+br.getName()+"' has been Succesfully Added to the Platform");
			return true;           
		}
		System.out.println("The Brand '"+br.getName()+"' already exists on the platform");
		return false;
	}
	public static Boolean DeleteBrand (Brand br) {
		if(CheckExist(br, Main.Brands)==true) {
			Main.Brands.remove(br);
			System.out.println("The Brand "+br.getName()+" has been Succesfully Deleted from the Platform");
			return true;           
		}
		System.out.println("The Brand '"+br.getName()+"' doesn't exists on the platform");
		return false;
	}
	public static Boolean RejectBrand (Brand br) {
		if(CheckExist(br, Main.Brands_Sugg)==true) {
			Main.Brands_Sugg.remove(br);
			System.out.println("The Brand Suggestion '"+br.getName()+"' has been Succesfully Rejcected");
			return true;
		}
		System.out.println("The Brand Suggestion '"+br.getName()+"' doesn't exists");
		return false;
	}
	public static Boolean ApproveBrand (Brand br) {
		if(CheckExist(br, Main.Brands_Sugg)==true) {
			Main.Brands_Sugg.remove(br);
			Main.Brands.add(br);
			System.out.println("The Brand Suggestion '"+br.getName()+"' has been Succesfully Approved");
			return true;
		}
		System.out.println("The Brand Suggestion '"+br.getName()+"' doesn't exists");
		return false;
	}
	


}