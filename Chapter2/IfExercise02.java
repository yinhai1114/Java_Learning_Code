import java.util.Scanner;//
public class IfExercise02{
	public static void main(String[] args){ 
		int years;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("pleas enter the years");
		years = myScanner.nextInt();
		if((years % 4 == 0 ^ years % 100 == 0) || years % 400 == 0){
			System.out.println( years + " is Leap year");
		}
		else{
			System.out.println( years + " is not Leap year");
		}
	} 
}