import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args){
		int arr[] = {10, 12, 45, 90};//��ʼ����
		System.out.print("Ŀǰ����Ϊ");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + "\t");//ѭ����ӡ���飬�����û�����Ϊ
			}
		while(true){//�����ж��Ƿ�������У���ִ��һ�κ�����Ϊ0��������
			//���Կ���ʹ��do whlie
			int arr2[] = new int[arr.length + 1];
			//�������ӵ����飬����Ϊ��ʼ���鳤��+1
			int enter = 0;//�û���������
			int count = 0;//��ȡ����������ڵڼ����������������С
			Scanner myScanner = new Scanner(System.in);
			System.out.println("\n������һ�����֣����뵽��������");
			enter = myScanner.nextInt();//����
			for(int i = 0; i < arr.length; i++){
				if(enter < arr[i]){//������������������
					//������С��ĳ������ʱ���������� ����¼���ڵڼ���С��
					//��������һ��50����ζ�ŵ�i = 3ʱС��90����¼�±�
					//�ں����ģ�齫50�ŵ�arr[3]��
					count = i;
					System.out.println(count + "�±�Ϊ");
					break;
				}
				if(count == 0){//��¼�±꣬���û�л�ȡ���±꣬��ζ�������������
					//�ֶ���¼һ���±�Ϊ���鳤�ȼ�i = 4�Ǻ�������Ҫ�Ž�ȥ���Ǹ���
					count = arr.length;
				}
			}
			for(int i = 0; i < arr2.length; i++){//ѭ����ֵ����arr��ֵ�ᵽarr2��
				if(i < count){//����ǰ���50�����Ѿ���ȡ��i = 3 ���±���Ҫ����50��
					//��С������±��ʱ���������ֵ�ͺ�
					arr2[i] = arr[i];
				}
				else if(i == count){//��ѭ������ȷ���±�֮�󣬽�arr2[] ��ֵ��Ϊ enter
					arr2[i] = enter;
				}
				else{//֮��ֻ�д��ڵ������
					arr2[i] = arr[i - 1];//���������Ѿ��Ź��ˣ�����Ҫ��ȡһ��ԭ�����ֵ
					//��������ȡ��������������� Ҳֻ�ǲ�ִ��else����������ƨ�ɺ���
					//���������ֵ��ͬ�Ļ��Ǵ������ֵ����������԰���
				}
			}
			arr = arr2;//���ø�ֵ
			System.out.print("Ŀǰ����Ϊ");
			for(int i = 0; i < arr.length; i++){//��ӡ����
				System.out.print(arr[i] + "\t");
			}
			System.out.println("\n����0��������");//ѯ���Ƿ��������
			enter = myScanner.nextInt();
			if(enter == 0){
				break;
			}
		}
	}
}
