//������1.ѧ���ɼ���������Ҫforѭ�������ظ���Σ�Ȼ���������У�
//���ü�¼ÿ��ѧ���ĳɼ���
//2.Ȼ����������ƽ���֣����а༶ƽ����
import java.util.Scanner;
public class MultpleForExercise{
	public static void main(String[] args){
		// int a1,a2,a3,a4,a5 = 0;
		// int b1,b2,b3,b4,b5 = 0;
		// int c1,c2,c3,c4,c5 = 0; 
		//Ŀǰֻ���뵽��������ȥ���������������
		double count = 0;				
		double classSum = 0;
		Scanner myScanner = new Scanner(System.in);
		for(int j = 1;j <= 3;j++){
			double sum = 0;
			for(int i = 1;i <= 5;i++){
				System.out.println("�������"+ j +"���༶����" + i 
					+ "��ѧ���ĳɼ�" );
				count = myScanner.nextDouble();
				sum += count;

				
			}
			classSum += sum;
			System.out.println("ѧ���ܷ�=" + sum);
			System.out.println("ѧ��ƽ����=" + (sum / 5.0));	
    	}
    	System.out.println("���а༶�ܷ�=" + classSum);	
    	System.out.println("���а༶ƽ����=" + (classSum / 5.0));	
	}
}
