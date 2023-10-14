public class DoWhileExercise{
	public static void main(String[] args){
		int start = 1,end = 200,count = 0;
		int t = 5,n = 3;
			do {
				if(start % t == 0 && start % n != 0){
					System.out.println(start);
					count++;
				}
				start++;
		}while(start <= end);
		System.out.println(count);
    }
}
