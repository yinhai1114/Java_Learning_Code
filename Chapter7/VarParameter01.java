public class VarParameter01{
	public static void main(String[] args){
		HspMethod a = new HspMethod();
		System.out.println(a.sum(654,16,1561,0));
	}
}
class HspMethod{
	//�����������ĺ� �������ĺ� �ĸ��ĺ͡���N���ĺ�
	//����ʹ�÷������� 
	// public int sum (int n1,int n2){
	// 	return n1 + n2;
	// }
	// public int sum (int n1,int n2��int n3){
	// 	return n1 + n2;
	// }
	// public int sum (int n1,int n2,int n3,int n4){
	// 	return n1 + n2;
	// }
	//���漸������ֻ����ʽ������ͬ������ʹ�ÿɱ�����Ż�
	public int sum (int ... nums){//���Խ���n��int ���nums���Ե�������
		System.out.println("���ܵĲ�������" + nums.length);
		int sums = 0;
		for (int i = 0;i < nums.length;i++){
			sums += nums[i];
		}
		return sums;
	}
}