import java.util.Scanner;
public class MethodExecrise02{
	public static void main(String[] args){
		int hang = 0;
		int lie = 0;
		char zifu;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入行数");
		hang = myScanner.nextInt();
		System.out.println("请输入列数");
		lie = myScanner.nextInt();
		System.out.println("请输入字符");
		zifu = myScanner.next().charAt(0);
		PrintOut outPut = new PrintOut();
		outPut.arrPrint(hang,lie,zifu);
	}
}
class PrintOut{
	public void arrPrint(int hang,int lie,char zifu){
		for(int i = 0;i < hang;i++){
			for(int j = 0;j < lie;j++){
				System.out.print(zifu + "\t");
			}
			System.out.println();
		}
	}
}