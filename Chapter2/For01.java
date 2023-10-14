public class For01{
	public static void main(String[] args){
		for(int i = 0,j = 0; i <= 10;i++ , j += 2) {//j += 2 == j = j + 2
			System.out.println("i=" + i + '\t' + "j= " + j);
		}
	}
}