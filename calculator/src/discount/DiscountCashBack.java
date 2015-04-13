package discount;

public class DiscountCashBack extends Discount{

	private double limit=0;
	private double cashback=0;
	public DiscountCashBack(double limit, double cashback){
		this.limit=limit;
		this.cashback=cashback;
	}
	
	public double getTotal(){
		if(originalTotal>limit){
			originalTotal=originalTotal-cashback;
		}
		return originalTotal;
	}
}
