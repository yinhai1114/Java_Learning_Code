import java.util.Scanner;
public class chapter2Exercise04{
	public static void main(String[] args){
		int num = 0;
		int a,b,c = 0;//�����λʮλ��λ
		while(true){
			Scanner myScanner = new Scanner(System.in);
			System.out.println("����һ��3λ������");
			num = myScanner.nextInt();
			// System.out.println(num / 100 <= 9 && num / 100 >= 1);
			if (num / 100 <= 9 && num / 100 >= 1){
				a = num /100;
				b = (num - a * 100) / 10;
				c = (num - a * 100 - b * 10) / 1;
				if (a * a * a + b * b * b + c * c *c == num){
					System.out.println(num + "��ˮ�ɻ���\n");
				}
				else {
					System.out.println(num + "����ˮ�ɻ���\n");
					}
			}
			else{
				System.out.println("����Ĳ���3λ�����֣�������\n");
				continue;
			}			
		}
	}
}
