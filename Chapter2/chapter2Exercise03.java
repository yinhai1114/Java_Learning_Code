import java.util.Scanner;
public class chapter2Exercise03{
	public static void main(String[] args){
		int years = 0;
		while(true){
			Scanner myScanner = new Scanner(System.in);
			System.out.println("����һ������");
			years = myScanner.nextInt();
			if(years % 4 == 0 && years % 100 != 0){
				System.out.println(years + "Ϊ����");
			}
			else if(years % 400 == 0){
				System.out.println(years + "Ϊ����");
			}
			else {
				System.out.println(years + "��������");
			}
		}
	}
}