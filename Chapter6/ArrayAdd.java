import java.util.Scanner;//
public class ArrayAdd{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int[] arr1 = {1,2,3};
		int[] arr2;
		int enter = 0;
		int i = arr1.length - 1;//���Ԫ�ص��±꣬����������2
		char answer;
		while(true){
			i++;//����ѭ�� ������Ҫi��������Ҫ��ӵ����Ԫ�ص��±꣬�����һ�����
			//���Ƕ�arr1[3]���д���
			System.out.println("����������ӵ�����");
			enter = myScanner.nextInt();
			arr2 = new int[i + 1];//�ı�˼·���þɵ�С���Ǹ����鸳ֵ���µĴ�����������
			for(int j = 0;j < arr1.length;j++) //�������飬��arr1������arr2�� 
			//ע�⣬��ʱ�ı�������Ӧ����arr1�ĳ��ȶ�����arr2��
				{
					arr2[j] = arr1[j];//�����ǿ�����ֵ�����ı����õ�ֵ�Ĵ�С����arr2����
				}
			System.out.println("�Ѿ��ɹ����" + enter + "��������" + i + "��Ԫ��");
			arr2[i] = enter;//��ʱ��ֵenter��arr1�ĵ�i��Ԫ��
			arr1 = arr2; //���ø�ֵ���ؼ��еĹؼ���ʹ�øø�ֵ������arr1��ֵָ��arr2����ʱ����1 2 3 4
			//�Ͳ��õ���arr1��������
			System.out.println("�Ƿ������� y/n");
			answer = myScanner.next().charAt(0);
			if(answer != 'y'){
				System.out.printf("��������arr1 = ");
				for(int k = 0;k < arr2.length;k++) //ѭ����ӡ����
				{
					System.out.printf("%d,",arr1[k]);
				}
				break;
			}
		}
	}
}