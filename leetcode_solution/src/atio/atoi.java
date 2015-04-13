package atio;

public class atoi {
	public static void main(String [ ] args){
		//System.out.println(atio("-+1"));
		System.out.println(atio("2147483648"));
	}
	
	public static int atio(String str){
		
		str=str.trim();
		int number=0;
		String str2int="";
		boolean flag=true;
		try{
			if(str==""){
				number = 0;
			}else{
				for(int i=0;i<str.length();i++){
					if(i==0 && str.charAt(i)=='-'){
						str2int+=str.charAt(i)+"";
						flag=false;
					}else if(i==0 && str.charAt(i)=='+'){
						flag=true;
					}else if(str.charAt(i)==' '|| !Character.isDigit(str.charAt(i))){
						break;
					}else if(Character.isDigit(str.charAt(i))){
						str2int+=str.charAt(i)+"";
					}
				}
				System.out.println(str2int);
			}
			
			if(str2int=="" || str2int.equals("-")){
				str2int = "0";
				System.out.println("here");
			}else{
				System.out.println("here 2");
				number=Integer.parseInt(str2int);
			}
		}catch(NumberFormatException e){
			number=flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		}
		return number;
	}
}
