public class Array01{
	public static void main(String[] args){
		double[] d = {3,5,1,3.4,2,50};//[]��ʾ��������double���͵����飬 dΪ������
		//{}��ʾ�����ڵ�Ԫ�أ�����3.4�ǵ�3��Ԫ��
		System.out.println(d.length);
		double sum = 0.0;
		for(int i = 0;i < d.length;i++){
			System.out.println("��" + i + "��Ԫ�ص�ֵΪ" + d[i]);
			sum += d[i];
		}
		System.out.println(sum);
		System.out.println(sum / 6.0);
	}
}