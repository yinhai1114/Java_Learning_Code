public class ArrayExercise02{
	public static void main(String[] args){
		int num[] = {4,-1,9,10,23};
		int max = 0;
		int count = 0;
		for(int i = 0;i < num.length;i++){
			if (num[i] > max) {
				max = num[i];
				count = i;
			}
		}
		System.out.println(max + "  " + count);
	}
}