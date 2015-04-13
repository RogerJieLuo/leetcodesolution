package discount;

public class DiscountFactory {

	public static Discount getDiscountType(String type){
		Discount dis=null;
		switch(type){
		// weakness is the value is not flexiable.
			case "percentoff":
				dis=new DiscountPercentOff(100,30);
				break;
			case "cashback":
				dis=new DiscountCashBack(100,50);
				break;
		}
		return dis;
	}
}
