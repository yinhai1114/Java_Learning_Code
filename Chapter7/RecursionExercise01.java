public class RecursionExercise01{
	public static void main(String[] args){
		MyTools tools = new MyTools();
		int num = tools.num(4);
		System.out.println(num);
	}
}

class MyTools{
	public int num(int n){
		if (n > 1){
			return (num(n - 1) + 1) * 2 ;
		}
		else{
			return 1;
		}
	}
}