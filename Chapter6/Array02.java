import java.util.Scanner;//
public class Array02{
	public static void main(String[] args){
		// double[] scores = new double[5];
		double[] scores;//��ʱscores �� null
		scores = new double[5];
		for(int i = 0 ; i < scores.length;i++){
			System.out.println("�������" + (i + 1)+ "���˵ĳɼ�");
			Scanner myScanner = new Scanner(System.in);
			scores [i] = myScanner.nextDouble();
		}
		System.out.println("����˵ĳɼ��ֱ�Ϊ");
		for(int i = 0 ; i < scores.length;i++){
			System.out.printf("%-12.1f",scores[i]);
		}
	}
}