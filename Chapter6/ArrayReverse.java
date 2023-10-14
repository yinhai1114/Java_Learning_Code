public class ArrayReverse{
	public static void main(String[] args){
		int[] arr1 = {11,22,33,44,55,66};
		int[] arr2 = new int[arr1.length];
		for(int i = 0;i < arr1.length;i++){
			System.out.printf("arr1=%d  " ,arr1[i]);
		}
		System.out.println();
		for(int i = 0;i < arr1.length;i++){
			arr2[i] = arr1[arr1.length - 1 - i];
			System.out.printf("arr2=%d  " ,arr2[i]);
		}
		System.out.println();
		for(int i = 0;i < arr1.length;i++){
			arr1[i] = arr2[i];
		}
		for(int i = 0;i < arr1.length;i++){
			System.out.printf("arr1=%d  " ,arr1[i]);
		}
	}
}