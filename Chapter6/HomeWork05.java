public class HomeWork05{
	public static void main(String[] args){
		int arr[] = new int[10];
		int min = 0;
		int index = 0;
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100.0 + 1);
		}	
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		} 
		System.out.println();
		for(int i = 0;i < arr.length; i++){
			min = 0;
			for (int j = arr.length - 1; j > i; j--){
				if(arr[j-1] < arr[j]){
					min = arr[j - 1];
					arr [j - 1] = arr[j];
					arr [j] = min;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + "\t");
			}
		System.out.println();
	}
}

