package leetcode_solution;

public class rever_bits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(reverseBits(1));
	}
	
	public static int reverseBits(int n) {
		int reverse=0;
		String str=Integer.toBinaryString(n);
		
		
		StringBuilder str_ = new StringBuilder(str);
		str=str_.reverse().toString();
		
		int len=str.length();
		for(int i=0;i<(32-len);i++){
			str+="0";
		}
		
		try{
			System.out.print(str+"\n");
			Long decimal = Long.parseLong(str, 2);
			//reverse=Integer.parseInt(str);
			reverse=decimal.intValue();
			System.out.print(reverse);
		}catch(NumberFormatException e){
			reverse=0;
		}
		
		return reverse;
		
    }
}
