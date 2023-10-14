public class ArrayExercise{
	public static void main(String[] args){
		char letter[] = new char[25];
		for(int i = 0;i < 25;i++){
			letter[i] = (char)('A' + i);
			System.out.printf("%-2c",letter[i]);
		}
	}
}