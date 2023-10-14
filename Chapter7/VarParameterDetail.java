public class VarParameterDetail{
	public static void main(String[] args){
		//2.可变参数的实参可以为数组
		int arr[] = {1,2,3};
		T t1 = new T();
		t1.f1("jack",arr);
	}
}
class T{
	public void f1(String name,int... nums){
		System.out.println("长度为" + nums.length);
	}
}