public class BubbleSort{
	public static void main(String[] args){
		int[] arr1 = {1,2,3,4,5,6};
		int high = arr1.length - 1;
		int temp = 0;
		int count = 0;
		for(int i = high;i > 0;i--){
			for(int j = 0;j < i;j++){
				if(arr1[j] > arr1[j+1]){
					temp = arr1[j + 1];
					arr1[j + 1] = arr1[j];
					arr1[j] = temp;
					count++;
				}
			}
			System.out.printf("\narr1=");
			for(int k = 0;k < high + 1;k++){
			System.out.printf("%d ",arr1[k]);
			}
			if (count == 0){
				System.out.printf("\nThe array is ordered,does not need swapping");
				break;
			}
		}
	}
}