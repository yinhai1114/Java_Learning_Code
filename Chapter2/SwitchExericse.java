import java.util.Scanner;//
public class SwitchExericse{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);		
		System.out.println("enter a,b,c,d to trans A,B,C,D");
		char enter = myScanner.next().charAt(0);

		switch(enter){
			case 'a':
				System.out.println("A");
				break;			
			case 'b':
				System.out.println("B");
				break;			
			case 'c':
				System.out.println("C");
				break;			
			case 'd':
				System.out.println("D");
				break;			
			default:
				System.out.println("other");
				break;
		}
	}
}