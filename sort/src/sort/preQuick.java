package sort;

public class preQuick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score[] ={9,5,1,3,4,7,8,6,2};
		for(int i=0;i<score.length;i++){
			System.out.print(" "+score[i]);
		}
		System.out.println(" ");
		divi(score, 4);
	}
	
	/**
	 * 
	 * @param arr
	 * @param divi
	 * put all the value in the arr less than arr[divi] left
	 * put all the value in the arr bigger than arr[divi] right
	 */
	public static void divi(int arr[], int divi){
		int pivot=arr[divi];
		int low=0;
		int high=arr.length-1;
		int count=0;
		while(low<high){
			count++;
			System.out.print(" " + count);
			System.out.print(" before low:"+low+" high:"+high);
			while(arr[low]<pivot){
				low++;
			}
			while(arr[high]>pivot){
				high--;
			}
			System.out.println("; low is:"+low+", high is:"+high);
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			//low++;
			//high--;
			for(int i=0;i<arr.length;i++){
				System.out.print(" "+arr[i]);
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<arr.length;i++){
			//System.out.print(" "+arr[i]);
		}
		
	}
}
