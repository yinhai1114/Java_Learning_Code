public class BreakControl{
	public static void main(String[] args){
		int num = 99;
		for(int i = 0;i <= 100;i++){
			int k = (int)(Math.random() * 100) + 1;
			System.out.println(k);
			if(k == num){
				System.out.println("Find=" + k);
				break;
			}
		}
	}
}