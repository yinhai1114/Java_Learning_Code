//�ͳ˷���һ���������Դ�ӡ��һ�ߵĽ�����
//������˼����δ�ӡ��13579...��ʽ����Ϊ��i - 1�� * 2 + 1
//˼����μ���ռλ������Ϊ-1 * 2 Ϊ�շ���λ�������Ҫ�����Ļ��͵ñ���ȫ����Ԫ��
//ֱ���ҵ����ϵļ��ɡ�
//ɰ���ˣ���ʵ���ǲ���totalLevel - i�����ǿյġ�
import java.util.Scanner;
public class Starts{
	public static void main(String[] args){
		int totalLevel = 0;	
		int empty = 0;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������������");
		totalLevel = myScanner.nextInt();
		for(int i = 1;i <= totalLevel;i++){
			System.out.println();
			for(int k = 1;k <= totalLevel - i;k++){
				System.out.printf(" ");
			}
			if (i < totalLevel) {
				for(int j = 1;j <= ((i - 1) * 2 + 1) ;j++){
					if(j == 1 || j == ((i - 1) * 2 + 1)){
						System.out.printf("*");
					}
					else {
						System.out.printf(" ");
					}
				}
			}
			else {
				for(int j = 1;j <= (i - 1) * 2 + 1;j++){
					System.out.printf("*");
				}
			}
    	}	
	}
}
