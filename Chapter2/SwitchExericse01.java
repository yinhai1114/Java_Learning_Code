import java.util.Scanner;//
public class SwitchExericse01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);		
		System.out.println("enter score");
		double score = myScanner.nextDouble();
		if(score <= 100.0 && score >= 0.0){
			switch((int)(score/60)){
				case 1:
					System.out.println("Pass");
					break;

				case 0:
					System.out.println("Not pass");
					break;
			}
		}
		else {
			System.out.println("worng date");
		}

	}
}

