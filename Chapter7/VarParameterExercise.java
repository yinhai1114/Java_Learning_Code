public class VarParameterExercise{
	public static void main(String[] args){
		int arr[] = {20,50,6000};
		T t1 = new T();
		System.out.println(t1.f1("jack",arr));
	}
}
class T{
	public String f1(String name,int... nums){
		int sum = 0;
		for(int i = 0;i < nums.length;i++){
			sum += nums[i];
		}
		return name + " ×Ü³É¼¨=" + sum;
	}
}