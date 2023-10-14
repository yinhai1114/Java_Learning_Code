public class chapter2Exercise{
	public static void main(String[] args){
		double savingsAccount = 100000.0;
		int taxRate = 50000;
		int i = 0;
		while (true){
			if(savingsAccount > taxRate){
				// savingsAccount = savingsAccount - savingsAccount * 0.05;
				savingsAccount *= 0.95;
				System.out.printf("由于您余额>50000,收取5%%，您已交费%.2f，剩余余额%.2f\n",savingsAccount * 0.05,savingsAccount);
				i++;
			}
			else if (1000.0 <= savingsAccount){//可以省略&& savingsAccount <= 50000
				// if(savingsAccount < 1000.0){
				// 	System.out.printf("余额不足，请充值\n");
				// 	break;
				// }
				savingsAccount = savingsAccount - 1000.0;
				System.out.printf("由于您余额<50000,收取1000整，您已交费1000元剩余余额%.2f\n",savingsAccount);
				i++;
			}
			else {
				System.out.printf("余额不足，剩余%.2f\n",savingsAccount);
				break;
			}
		}
		System.out.printf("您已通过%d次，剩余余额%.2f\n",i,savingsAccount);
	}
}