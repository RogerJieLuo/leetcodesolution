package leetcode_solution;

import java.util.Arrays;
import java.util.HashMap;

public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={63,72,2,5,3, 13, 7, 11, 15};
		//int[] numbers={3,2,4};
		twoSum(numbers,9);
	}
	
	public static int[] twoSum(int[] numbers, int target){
		/*
		int[] indices = new int[2];
		for(int i=0;i<numbers.length;i++){
			for(int j=i+1;j<numbers.length;j++){
				if((numbers[i]+numbers[j])==target){
					indices[0]=i+1;
					indices[1]=j+1;
					System.out.print("index1 = "+indices[0]+"; index2 = "+indices[1]);
				}
				//System.out.print("index1 = "+numbers[i]+"; index2 = "+numbers[j]+"\n");
			}
			
		}
		return indices;
		*/
		
		
		
		/*
		int[] nums=new int[numbers.length];
		System.arraycopy(numbers, 0, nums, 0, numbers.length);
		Arrays.sort(nums);
		int[] indices=new int[2];
		int index1=0;
		int index2=nums.length-1;
		
		while(index1<index2){
			if(nums[index1]+nums[index2]<target){
				index1++;
				System.out.print("index1 "+nums[index1]+ "+index2+"+nums[index2]+"\n");
			}else if(nums[index1]+nums[index2]>target){
				index2--;
				System.out.print("index1 "+nums[index1]+ "+index2+"+nums[index2]+"\n");
			}
			else break;
		}
		//indices[0]=index1;
		//indices[1]=index2;
		
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]==nums[index1]){
				indices[0]=i+1;
			}
			if(numbers[i]==nums[index2]){
				indices[1]=i+1;
			}
		}
		int num1=nums[index1];
		int num2=nums[index2];
		System.out.print("index asd "+indices[0]+" num "+num1+ " index2 "+indices[1]+" number "+num2);
		return indices;
		*/
		
		/* solution 1
		int N = numbers.length;  
	    int[] sorted = new int[N];  
	    System.arraycopy(numbers, 0, sorted, 0, N);  
	       Arrays.sort(sorted);  
	       //find the two numbers using the sorted arrays  
	       int first = 0;  
	       int second = sorted.length - 1;  
	       while(first < second){  
	        if(sorted[first] + sorted[second] < target){  
	            first++;  
	            continue;  
	        }  
	        else if(sorted[first] + sorted[second] > target){  
	            second--;  
	            continue;  
	        }  
	        else break;  
	       }  
	       int number1 = sorted[first];  
	       int number2 = sorted[second];  
	       //Find the two indexes in the original array  
	       int index1 = -1, index2 = -1;  
	       for(int i = 0; i < N; i++){  
	        if((numbers[i] == number1) || (numbers[i] == number2)){  
	             if(index1 == -1)  
	                 index1 = i + 1;  
	             else  
	                 index2 = i + 1;  
	        }  
	              
	       }  
	       int [] result = new int[]{index1, index2};  
	       Arrays.sort(result);  
	    return result;  
	    */
		
		//solution two
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int[] indices = new int[2];
		
		for(int i=0;i<numbers.length;i++){
			if(map.containsKey(target-numbers[i])){
				indices[0]=map.get(target-numbers[i])+1;
				indices[1]=i+1;
				break;
			}else{
				map.put(numbers[i],i);
			}
		}
		return indices;
		
		
	}
}
