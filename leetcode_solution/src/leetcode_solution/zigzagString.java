package leetcode_solution;

public class zigzagString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Convert("PAYPALISHIRING",5));
	}

	public static String Convert(String s, int nRows){
		String finalStr="";
		if(nRows>1){
			String[] eachRow=new String[nRows];
			for(int i=0; i<eachRow.length;i++){
				eachRow[i]="";
			}
			int fo=2*nRows-2;
			for(int i=0;i<s.length();i++){
				if(i%fo<=nRows-1){
					eachRow[i%fo]+=s.charAt(i);
				}else{
					eachRow[fo-i%fo]+=s.charAt(i);
				}
				
			}
			
			for(int i=0; i<eachRow.length;i++){
				finalStr+=eachRow[i];
			}
		}else{
			finalStr=s;
		}
		return finalStr;
	}
}
