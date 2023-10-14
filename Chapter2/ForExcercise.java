public class ForExcercise{
	public static void main(String[] args){
		int i = 1,j = 0,sum = 0;
		for(;i <= 100;i++){
			if(i % 9 == 0){
				j += 1;
				sum += i;
				System.out.println("Multiples of 9 = " + i );
			}
		}
		System.out.println("Sum = " + sum + '\t' + "Num = " + j);
	}
}
