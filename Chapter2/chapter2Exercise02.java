import java.util.Scanner;
public class chapter2Exercise02{
	public static void main(String[] args){
		int num = 0;
		while(true){
			Scanner myScanner = new Scanner(System.in);
			System.out.println("����һ������");
			num = myScanner.nextInt();
			if(num > 0){
				System.out.println("����0\n");
			}
			else if(num < 0){
				System.out.println("С��0\n");
			}
			else if (num == 0) {
				System.out.println("����0\n");
			}
		}
	}
}