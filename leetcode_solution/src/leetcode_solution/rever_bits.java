package leetcode_solution;


public class rever_bits {
	public static void main(String [ ] args){
		
		//reverseBits(100002);
		System.out.print(Integer.MAX_VALUE);
		System.out.print(reverseBits(1534236469));
	}

    // you need treat n as an unsigned value
    public static int reverseBits(int x) {
		int reverse=0;
		while(x!=0){
			try{
				if(x%10!=0){
					// since the last digit is 9, no bother to check the last digit.
					if(reverse>(Integer.MAX_VALUE/10)||reverse<(Integer.MIN_VALUE/10)){
						reverse=0;
						break;
					}
					//if(reverse==Integer.MAX_VALUE/10 && x%10>)
					reverse=reverse*10+x%10;
				}
				else{
					reverse*=10;
				}
				x=x/10;
				System.out.print(reverse+"\n");
			}catch(ArithmeticException e){
				e.printStackTrace();// catch doesn't work, might be the wrong exception.
				//System.out.print("HhHh");
				reverse=0;
				break;
				//return 0;
			}
		}
		
		return reverse;
    }
	
}
