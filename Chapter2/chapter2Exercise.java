public class chapter2Exercise{
	public static void main(String[] args){
		double savingsAccount = 100000.0;
		int taxRate = 50000;
		int i = 0;
		while (true){
			if(savingsAccount > taxRate){
				// savingsAccount = savingsAccount - savingsAccount * 0.05;
				savingsAccount *= 0.95;
				System.out.printf("���������>50000,��ȡ5%%�����ѽ���%.2f��ʣ�����%.2f\n",savingsAccount * 0.05,savingsAccount);
				i++;
			}
			else if (1000.0 <= savingsAccount){//����ʡ��&& savingsAccount <= 50000
				// if(savingsAccount < 1000.0){
				// 	System.out.printf("���㣬���ֵ\n");
				// 	break;
				// }
				savingsAccount = savingsAccount - 1000.0;
				System.out.printf("���������<50000,��ȡ1000�������ѽ���1000Ԫʣ�����%.2f\n",savingsAccount);
				i++;
			}
			else {
				System.out.printf("���㣬ʣ��%.2f\n",savingsAccount);
				break;
			}
		}
		System.out.printf("����ͨ��%d�Σ�ʣ�����%.2f\n",i,savingsAccount);
	}
}