import java.util.Scanner;//
public class switch01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("enter a,b,c,d,e,f,g to display week");
		char enter = myScanner.next().charAt(0);
		switch(enter){
			case 'a':
				System.out.println("Today is mon");
				break;

			case 'b':
				System.out.println("Today is tue");
				break;

			case 'c':
				System.out.println("Today is wed");
				break;

			case 'd':
				System.out.println("Today is thu");
				break;

			case 'e':
				System.out.println("Today is fri");
				break;

			case 'f':
				System.out.println("Today is sat");
				break;

		    case 'g':
				System.out.println("Today is Sunday");
				break;

			default:
				System.out.println("wrong date");
				break;
		}
	}
}