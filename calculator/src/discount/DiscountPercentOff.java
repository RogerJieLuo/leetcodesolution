package discount;

public class DiscountPercentOff extends Discount {

	private double limit=0;
	private double percent;
	public DiscountPercentOff( double limit, double percent){
		this.limit=limit;
		this.percent=percent;
	}
	public double getTotal(){
		if(originalTotal>limit){
			originalTotal=originalTotal*(1-percent/100);
		}
		return originalTotal;
	}
}
