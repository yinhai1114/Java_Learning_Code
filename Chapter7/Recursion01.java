public class Recursion01{
	public static void main(String[] args){
		Mytools a = new Mytools();
		int n = 4;
		int num = a.factorial(n);
		System.out.println(num);
	}
}
class Mytools{
	public int factorial(int n){
		// System.out.println("n=" + n);
		if(n == 1){
			return 1;
		}else{
			return factorial(n - 1) * n;
		}
	}
}