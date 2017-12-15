
import java.util.*;


public class VoucherCard  {

    
    public VoucherCard() {
    	 VoucherCode = 0;
    	 value = 0 ;
    }
    public VoucherCard(int code,int v) {
   	 this.VoucherCode = code;
   	 this.value =v  ;
   }
    public VoucherCard(VoucherCard v) {
      	 this.VoucherCode = v.VoucherCode;
      	 this.value =v.value ;
      }

    private int VoucherCode;
    private int value;
    
    public void setVoucherCode(int vouchercode) {
        vouchercode = this.VoucherCode;
    }
    public int getVoucherCode() {
        return this.VoucherCode;
    }

    
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        value = this.value;
    }

}