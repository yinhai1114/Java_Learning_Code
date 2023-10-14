import java.util.Scanner;
public class chapter2Exercise02{
	public static void main(String[] args){
		int num = 0;
		while(true){
			Scanner myScanner = new Scanner(System.in);
			System.out.println("输入一个数字");
			num = myScanner.nextInt();
			if(num > 0){
				System.out.println("大于0\n");
			}
			else if(num < 0){
				System.out.println("小于0\n");
			}
			else if (num == 0) {
				System.out.println("等于0\n");
			}
		}
	}
}