import java.util.Scanner;//
public class ArrayReduce{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		char answer;
		int i = arr1.length - 1;//最高元素的下标，例如现在是4
		while(true){
			System.out.printf("\n输入 y/n 执行数组删减\n");
			answer = myScanner.next().charAt(0);			
			
			if(answer == 'y'){
				if(i == 0){//判断是否到0  到0即就剩一个元素了
				System.out.printf("已达到最小元素，无法删减，输入n来关闭程序，现在数组arr1=%d\n",arr1[0]);
				continue;
				}
				i--;//下标自减
				arr2 = new int[i + 1];//长度为下标+1
				for(int j = 0;j < arr2.length;j++) //遍历数组，将arr1拷贝到arr2上，拷贝的次数为arr2的长度
				{
					arr2[j] = arr1[j];//这里是拷贝赋值，不改变地址而是arr2本身元素的值
				}
				arr1 = arr2;//指向arr2的地址，销毁旧的arr1数据空间
				System.out.printf("此时数组arr1=");
				for(int k = 0;k < arr2.length;k++) //循环打印数组
				{
					System.out.printf("%-2d",arr1[k]);
				}
			}
			else if(answer == 'n'){
				System.out.printf("\n关闭程序\n");
				break;
			}

		}
	}
}