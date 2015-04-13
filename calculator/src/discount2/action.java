package discount2;

public class action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount dis=null;
		
		Context context=new Context(dis);
		
		String type="percentoff";
		switch(type){
			case "percentoff":
				context=new Context(new DiscountPercentOff(100,30));
				break;
			case "cashback":
				context=new Context(new DiscountCashBack(100,50));
				break;
		}
		
		double result=context.getTotal();
		System.out.print(" the result is "+result);
		
	}

}
