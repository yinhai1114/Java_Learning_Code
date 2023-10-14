import java.util.Scanner;//
public class If03{
	public static void main(String[] args){
		int num1;
		System.out.println("Pleas enter your cerdit (0-100)");
		Scanner myScanner = new Scanner(System.in);
		num1 = myScanner.nextInt();
		if(num1>=0 && num1<=100){
			if (num1 == 100){
				System.out.println("Excellent cerdit");
			}
			else if(num1 <= 99 && num1 > 80){
				System.out.println("Good cerdit");
			}
			else if(num1 <= 80 && num1 > 60){
				System.out.println("Normal cerdit");
			}
			else if(num1 > 100){
				System.out.println("Good cerdit");
			}
		}
		else{
			System.out.println("Wrong date,pleas enter cerdit again");
		}
	}
}