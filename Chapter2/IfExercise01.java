public class IfExercise01{
	public static void main(String[] args){ 
		// double num1 = 30;
		// double num2 = 15;
		// if(num1 > 10 && num2 < 20){
		// 	System.out.println("Plus=" + (num1 + num2));
		int num3 = 5;
		int num4 = 10;
		int plus1 = num3 + num4;
		if(plus1 % 3 < 0.01 && plus1 % 5 < 0.01 ){
			System.out.println("that can divisible by 3 and 5");
		}
		else{
			System.out.println("that can not divisible by 3 and 5");
		}
	}
}