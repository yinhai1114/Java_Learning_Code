import java.util.Scanner;//
public class Array02{
	public static void main(String[] args){
		// double[] scores = new double[5];
		double[] scores;//此时scores 是 null
		scores = new double[5];
		for(int i = 0 ; i < scores.length;i++){
			System.out.println("请输入第" + (i + 1)+ "个人的成绩");
			Scanner myScanner = new Scanner(System.in);
			scores [i] = myScanner.nextDouble();
		}
		System.out.println("五个人的成绩分别为");
		for(int i = 0 ; i < scores.length;i++){
			System.out.printf("%-12.1f",scores[i]);
		}
	}
}