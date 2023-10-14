public class ForExcercise01{
	public static void main(String[] args){
		int i = 0,j = 5,sum = 0;
		for(;i <= 5;i++,j--){
			System.out.println(i + "+" + j + "=" + (sum = i + j));
		}
	}
}
