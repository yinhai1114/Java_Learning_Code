public class MethodParameter02{
	public static void main(String[] args){
		B myTools = new B();
		int[] arr = {10,20,50,15,100};
		myTools.printArr(arr);
		myTools.swap(arr);//ע�⴫������Ӧ����������������[]
		myTools.printArr(arr);
	}
}
// class Persong{
// 	String name;
// 	int age;
// }
class B{
	public void swap (int arr[]){
		for(int i = 0;i < arr.length; i++){
			int min = 0;
			for (int j = 0; j < i; j++){
				if(arr[j] > arr[j + 1]){
					min = arr[j];
					arr [j] = arr[j + 1];
					arr [j + 1] = min;
				}
			}
		}
		printArr(arr);
	}
	public void printArr(int arr[]){
		System.out.println("");
		for(int i = 0; i < arr.length; i++){//��ӡ����
			System.out.print(arr[i] + "\t");
		}
	}
}
