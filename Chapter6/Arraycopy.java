public class Arraycopy{
	public static void main(String[] args){
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[arr1.length];
		for(int i = 0;i < arr1.length;i++){
			arr2[i] = arr1[i];
			System.out.println("arr2=" + arr2[i]);
		}
		arr2[2] = 500;
		for(int i = 0;i < arr1.length;i++){
			System.out.println("arr1=" + arr1[i]);
			System.out.println("arr2=" + arr2[i]);
		}
	}
}