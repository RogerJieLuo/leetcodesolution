package leetcode_solution;

import java.util.HashMap;

public class longestsubstring {
	public static void main(String [ ] args){
		System.out.print(lengthOfLongestSubstring("asdf"));
	}
	
	public static int lengthOfLongestSubstring(String s){
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		int[] longLen=null;
		int num=0;
		for(int i=0;i<s.length();i++){
			//System.out.println(s.charAt(i));
			if(map.containsKey(s.charAt(i))){
				
			}else{
				map.put(s.charAt(i), i);
				System.out.println(s.charAt(i));
				
				String k=""+s.charAt(i);
				String[] longStr=s.split(k);
				int max=0;
				for(int j=0;j<longStr.length;j++){
					if(longStr[j].length()>max){
						max=longStr[j].length();
					}
				}
				longLen[num]=max;
			}
		}
		
		/*
		System.out.println("the size: "+map.size());
		int[] longLen=new int[map.size()];int num=0;
		for(Character key : map.keySet()){
			map.get(key);
			String k=""+key;
			String[] longStr=s.split(k);
			int max=0;
			for(int i=0;i<longStr.length;i++){
				if(longStr[i].length()>max){
					max=longStr[i].length();
				}
			}
			longLen[num]=max+1;
			num++;
		}
		*/
		int max2=0;
		for(int i=0;i<longLen.length;i++){
			if(longLen[i]>max2){
				max2=longLen[i];
			}
		}
		
		return max2;
		
		
		/*
		 char[] arr = s.toCharArray();
	int pre = 0;
 
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 
	for (int i = 0; i < arr.length; i++) {
		if (!map.containsKey(arr[i])) {
			map.put(arr[i], i);
		} else {
			pre = Math.max(pre, map.size());
			i = map.get(arr[i]);
			map.clear();
		}
	}
 
	return Math.max(pre, map.size());
	*/
		/*correct solution
		 * 
		 * boolean[] flag = new boolean[256];
 
	int result = 0;
	int start = 0;
	char[] arr = s.toCharArray();
 
	for (int i = 0; i < arr.length; i++) {
		char current = arr[i];
		if (flag[current]) {
			result = Math.max(result, i - start);
			// the loop update the new start point
			// and reset flag array
			// for example, abccab, when it comes to 2nd c,
			// it update start from 0 to 3, reset flag for a,b
			for (int k = start; k < i; k++) {
				if (arr[k] == current) {
					start = k + 1; 
					break;
				}
				flag[arr[k]] = false;
			}
		} else {
			flag[current] = true;
		}
	}
 
	result = Math.max(arr.length - start, result);
 
	return result;
		 * 
		 */
	}
}
