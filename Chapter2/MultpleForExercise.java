//分析，1.学生成绩的输入需要for循环依次重复五次，然后存入变量中，
//不用记录每个学生的成绩，
//2.然后计算和数和平均分，还有班级平均分
import java.util.Scanner;
public class MultpleForExercise{
	public static void main(String[] args){
		// int a1,a2,a3,a4,a5 = 0;
		// int b1,b2,b3,b4,b5 = 0;
		// int c1,c2,c3,c4,c5 = 0; 
		//目前只是想到用数组存进去，单个变量不会存
		double count = 0;				
		double classSum = 0;
		Scanner myScanner = new Scanner(System.in);
		for(int j = 1;j <= 3;j++){
			double sum = 0;
			for(int i = 1;i <= 5;i++){
				System.out.println("请输入第"+ j +"个班级，第" + i 
					+ "个学生的成绩" );
				count = myScanner.nextDouble();
				sum += count;

				
			}
			classSum += sum;
			System.out.println("学生总分=" + sum);
			System.out.println("学生平均分=" + (sum / 5.0));	
    	}
    	System.out.println("所有班级总分=" + classSum);	
    	System.out.println("所有班级平均分=" + (classSum / 5.0));	
	}
}
