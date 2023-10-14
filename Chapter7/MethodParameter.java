public class MethodParameter{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		AA aa = new AA();
		aa.swap(a,b);
		System.out.println(" a=" + a + "\tb=" + b);

	}
}
class AA{
	public void swap (int a,int b){
		System.out.println("交换前的值a=" + a + "\tb=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("交换后的值a=" + a + "\tb=" + b);

	}
}