package sort;

public class insert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] ={75, 69, 100, 87, 67,  90, 89, 99, 1, 13};
		//check the length of array must be at least two numbers.
		for(int i=0;i<score.length-1;i++){
			for(int j=i+1;j>=0;j--){
				// get the part of array that rearrange.
				// move the small one to the right place in the part of array.
				while(0<j){
					if(score[j-1]>score[j]){
						int temp=score[j-1];
						score[j-1]=score[j];
						score[j]=temp;
					}
					j--;
				}
			}
		}
		
		System.out.println("");
		for(int i=0;i<score.length;i++){
			System.out.print(score[i]+" ");
		}
	}
	
	private static int[] insertSort(int[]arr){
		if(arr == null || arr.length < 2){
		    return arr;
		}
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1]){
					//TODO:
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}else{
					break;
				}
			}
		}
		return arr;
		}
}
