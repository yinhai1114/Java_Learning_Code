public class TwoDimensionalArray02{
	public static void main(String[] args){
		int[][] arr = new int [10][];//��ʱֻ�����˶�λ����Ĵ�С����������һά����
		for(int i = 0; i < arr.length ;i++){//ѭ��3��
			arr[i] = new int[i + 1];//��ʱarr[i]ָ���ǵ�i��Ԫ��
//int [i + 1]�Ƕ���ÿһ��һά����Ĵ�С ����i = 2��ʱ�򣬶���ڶ�������Ĵ�СΪ3
			for(int j = 0; j < arr[i].length ;j++){//����ÿһ��һά�����ÿһ��Ԫ��
				arr[i][j] = i + 1;//��ֵ
			}
		}
		for(int i = 0; i< arr.length; i++){//������ά�����ÿһ������
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}//�������Ҫ��λ��i����Ϊ����ĵ�j��ֵ arr[i - 1][j - 1]
			System.out.println();//����
		}
	}
}