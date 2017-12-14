import java.util.Vector;

public class VoucherController {		
	
	public static Boolean CheckExist (VoucherCard vr, Vector<VoucherCard> vrs) {
		for(int i=0;i<vrs.size();i++) {
			if(vr.getVoucherCode()==vrs.get(i).getVoucherCode())
				return true;
		}
		return false;
	}	
	public static Boolean AddVoucherCard (VoucherCard vr){
		if(CheckExist(vr, Main.VoucherCards)==false) {
			Main.VoucherCards.add(vr);
			System.out.println("The VoucherCard '"+vr.getVoucherCode()+"' has been Succesfully Added to the Platform");
			return true;           
		}
		System.out.println("The VoucherCard '"+vr.getVoucherCode()+"' already exists on the platform");
		return false;
	}
	public static Boolean DeleteVoucherCard (VoucherCard vr) {
		if(CheckExist(vr, Main.VoucherCards)==true) {
			Main.VoucherCards.remove(vr);
			System.out.println("The VoucherCard "+vr.getVoucherCode()+" has been Succesfully Deleted from the Platform");
			return true;           
		}
		System.out.println("The Main.VoucherCards '"+vr.getVoucherCode()+"' doesn't exists on the platform");
		return false;
	}
	


}
