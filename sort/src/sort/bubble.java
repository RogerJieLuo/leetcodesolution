package sort;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] ={67, 69, 75, 87, 89, 90, 99, 100};
		for(int i=0;i<score.length-1;i++){
			for(int j=0;j<score.length-1-i;j++){
				if(score[j]>score[j+1]){
					int temp=score[j];
					score[j+1]=score[j];
					score[j]=temp;
				}
			}
		}
		
		for(int i=0;i<score.length;i++){
			System.out.print(score[i]+" ");
		}
	}

}
