//1��1-100���ڵ�����ͣ�������͵�һ�δ���20�ĵ�ǰ��(for + break)
public class BreakExercise{
	public static void main(String[] args){
		int k = 1;
		int sum = 0;
		for (;k <= 100;k++){
			sum += k;
			System.out.printf("%-2d",k);
			if(sum >= 20){
				System.out.printf("���ǵĺ�Ϊsum=%d\n",sum);
				break;
			}
		}
	}
}