//�žų˷���ʹ����������ѭ����i = 1 ���ڲ�j = 1 �����ε�9
public class MultpleForExercise02{
	public static void main(String[] args){
		int mult = 0;
		for(int i = 1;i <= 9;i++){
			System.out.println();
			for(int j = 1;j <= i;j++){
				// System.out.println(j + " * " + i + " = " + (mult = i * j));
                System.out.printf("%d*%d=%-6d", j, i, i * j);//printf��println������
			}
		}
	}
}
