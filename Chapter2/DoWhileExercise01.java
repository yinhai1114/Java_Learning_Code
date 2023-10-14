import java.util.Scanner;
public class DoWhileExercise01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		char enter = 'y';
		do {
			if(enter != 'y'){
				System.out.println( "kick" + '\n');
			}
			System.out.println("y/n?");
			enter = myScanner.next().charAt(0);
			}while(enter != 'y');
		System.out.println("ok");
    }
}
