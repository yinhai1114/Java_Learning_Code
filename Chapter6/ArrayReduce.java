import java.util.Scanner;//
public class ArrayReduce{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		char answer;
		int i = arr1.length - 1;//���Ԫ�ص��±꣬����������4
		while(true){
			System.out.printf("\n���� y/n ִ������ɾ��\n");
			answer = myScanner.next().charAt(0);			
			
			if(answer == 'y'){
				if(i == 0){//�ж��Ƿ�0  ��0����ʣһ��Ԫ����
				System.out.printf("�Ѵﵽ��СԪ�أ��޷�ɾ��������n���رճ�����������arr1=%d\n",arr1[0]);
				continue;
				}
				i--;//�±��Լ�
				arr2 = new int[i + 1];//����Ϊ�±�+1
				for(int j = 0;j < arr2.length;j++) //�������飬��arr1������arr2�ϣ������Ĵ���Ϊarr2�ĳ���
				{
					arr2[j] = arr1[j];//�����ǿ�����ֵ�����ı��ַ����arr2����Ԫ�ص�ֵ
				}
				arr1 = arr2;//ָ��arr2�ĵ�ַ�����پɵ�arr1���ݿռ�
				System.out.printf("��ʱ����arr1=");
				for(int k = 0;k < arr2.length;k++) //ѭ����ӡ����
				{
					System.out.printf("%-2d",arr1[k]);
				}
			}
			else if(answer == 'n'){
				System.out.printf("\n�رճ���\n");
				break;
			}

		}
	}
}