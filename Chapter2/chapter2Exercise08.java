public class chapter2Exercise08{
	public static void main(String[] args){
		double sum = 0.0;
		int count = 0;
		while(count < 100){
			count++;
			if(count % 2 == 0){
				sum -= 1.0 / count;//ע�⣬��������count��int�ͣ�������Ҫ�ǵü�С��
//�Զ�ת��Ϊdouble��
			}
			else{
				sum += 1.0 / count;
			}
		}
		System.out.println(sum);
	}
}
