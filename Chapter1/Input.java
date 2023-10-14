import java.util.Scanner;//
public class Input{
	public static void main(String[] args){ 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Pleas enter your name");
		String name = myScanner.next();

		System.out.println("Pleas enter your age");
		int age = myScanner.nextInt();

		System.out.println("Pleas enter your salry");
		double salry = myScanner.nextDouble();

		char enter = myScanner.next().charAt(0);
		
		System.out.println("Name=" + name + '\t' + "Age=" + age 
		+ '\t' 	+ "Salry=" + salry+ '\t' );
	}
}