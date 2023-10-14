//和乘法表一样，先试试打印靠一边的金字塔
//接下来思考如何打印出13579...形式考虑为（i - 1） * 2 + 1
//思考如何加入占位，分析为-1 * 2 为空符号位，但如果要这样的话就得遍历全部的元素
//直接找到符合的即可。
//砂玻了，其实就是层数totalLevel - i，就是空的。
import java.util.Scanner;
public class Starts{
	public static void main(String[] args){
		int totalLevel = 0;	
		int empty = 0;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入金字塔层数");
		totalLevel = myScanner.nextInt();
		for(int i = 1;i <= totalLevel;i++){
			System.out.println();
			for(int k = 1;k <= totalLevel - i;k++){
				System.out.printf(" ");
			}
			if (i < totalLevel) {
				for(int j = 1;j <= ((i - 1) * 2 + 1) ;j++){
					if(j == 1 || j == ((i - 1) * 2 + 1)){
						System.out.printf("*");
					}
					else {
						System.out.printf(" ");
					}
				}
			}
			else {
				for(int j = 1;j <= (i - 1) * 2 + 1;j++){
					System.out.printf("*");
				}
			}
    	}	
	}
}
