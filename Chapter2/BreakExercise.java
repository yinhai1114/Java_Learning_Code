//1）1-100以内的数求和，求出当和第一次大于20的当前数(for + break)
public class BreakExercise{
	public static void main(String[] args){
		int k = 1;
		int sum = 0;
		for (;k <= 100;k++){
			sum += k;
			System.out.printf("%-2d",k);
			if(sum >= 20){
				System.out.printf("他们的和为sum=%d\n",sum);
				break;
			}
		}
	}
}