//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
//.....
//ÿһ����1��Ԫ�أ���n���е�n��Ԫ��
//ÿһ�еĵ�һ�������һ������1
//�ӵ����п�ʼ�����ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ص�ֵ��
//arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1]
public class YangHui{
	public static void main(String[] args){
		int arr[][] = new int[10][];
		for(int i = 0; i < 10; i++){
			arr[i] = new int[i + 1];//�����i��һά����Ĵ�С
			for(int j = 0; j < i + 1; j++){
				if(j == 0 || j == i){
					arr[i][j] = 1;//��һ��Ԫ�غ����һ��Ԫ�ظ�ֵΪ1
					System.out.printf("%-4d",arr[i][j]);//��ӡԪ��
					continue;//дcontinue��Ϊ�˱���Ϊ��һ���������һ��Ԫ��ʱ
					//ִ�������ʽ�ӣ���ʱ����ǵ�һ��Ԫ��jΪ0��ϵͳ���Ҳ���j - 1��Ԫ��
					//continue������������forѭ������j++
				}
				if(i > 1){//�ӵ����п�ʼ���м�ֵ�Ͳ�ֻ��1�ˣ���Ҫ�ù�ʽ����
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
					System.out.printf("%-4d",arr[i][j]);
				}
			}
			System.out.println();//��ӡ��ʱ����
		}
	}
}
