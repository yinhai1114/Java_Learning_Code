public class TwoDimensionalArray01{
	public static void main(String[] args){
		int[][] arr = {{0,0, 0, 0, 0,0},
		{0, 0, 1, 0, 0, 0},
		{0, 2, 0, 3, 0, 0},
		{0, 0, 0, 0, 0, 0}};
		for(int i = 0; i< arr.length; i++){//������ά�����ÿһ������
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}//�������Ҫ��λ��i����Ϊ����ĵ�j��ֵ arr[i - 1][j - 1]
			System.out.println();//����
		}
		
	}
}