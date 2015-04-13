package calculator;

public class action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorFactory of=new OperatorFactory();
		Operator oper=of.getOperator("-");
		oper.numberA=1;
		oper.numberB=2;
		double result=oper.getResult();
		System.out.println(result);
		Runtime rt = Runtime.getRuntime();
		System.out.print(rt.totalMemory()+ " "+rt.freeMemory());
	}

}
