public class Homework04{
	public static void main(String[] args){
		int[] arr = {3,6,9,546,162};
		A03 copyarr = new A03();
		int[] arr1 = copyarr.copyArr(arr);

		arr[4] = 0;
		System.out.println("Original array");
		for(int i = 0;i < arr.length;i++){
			System.out.print( arr[i] + "\t");
		}
		System.out.println("\nNew array");
		for(int i = 0;i < arr.length;i++){
			System.out.print( arr1[i] + "\t");
		}
	}
}
class A03{
	public int[] copyArr(int[] arr){
		int[] arr1 = new int[arr.length];
		for(int i = 0;i < arr.length;i++){
			arr1[i]=arr[i];
		}
		return arr1;
	}
}