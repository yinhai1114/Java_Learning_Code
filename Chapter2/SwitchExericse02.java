import java.util.Scanner;//
public class SwitchExericse02{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);		
		System.out.println("enter score");
		int month = myScanner.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("That spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("That summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("That autumn");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("That winter");
				break;
			default:
				System.out.println("Wrong data");
				break;
		}
	}
}