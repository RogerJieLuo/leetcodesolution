package calculator;

public class OperatorFactory {

	public static Operator getOperator(String operator){
		Operator oper=null;
		switch(operator){
			case "+":
				oper=new OperatorAdd();
				break;
			case "-":
				oper=new OperatorSub();
				break;
			case "*":
				oper=new OperatorMultiple();
				break;
				
		}
		return oper;
	}

}
