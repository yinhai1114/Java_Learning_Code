import java.util.Scanner;//
public class ArrayAdd{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int[] arr1 = {1,2,3};
		int[] arr2;
		int enter = 0;
		int i = arr1.length - 1;//最高元素的下标，例如现在是2
		char answer;
		while(true){
			i++;//自增循环 现在需要i就是我们要添加的最高元素的下标，比如第一次添加
			//就是对arr1[3]进行处理
			System.out.println("请输入想添加的整数");
			enter = myScanner.nextInt();
			arr2 = new int[i + 1];//改变思路，用旧的小的那个数组赋值到新的大的这个数组上
			for(int j = 0;j < arr1.length;j++) //遍历数组，将arr1拷贝到arr2上 
			//注意，此时的遍历次数应该是arr1的长度而不是arr2的
				{
					arr2[j] = arr1[j];//这里是拷贝赋值，不改变引用的值的大小而是arr2本身
				}
			System.out.println("已经成功添加" + enter + "整数到第" + i + "个元素");
			arr2[i] = enter;//此时赋值enter到arr1的第i个元素
			arr1 = arr2; //引用赋值，关键中的关键，使用该赋值可以让arr1的值指向arr2，此时就有1 2 3 4
			//就不用担心arr1不够大了
			System.out.println("是否继续添加 y/n");
			answer = myScanner.next().charAt(0);
			if(answer != 'y'){
				System.out.printf("现在数组arr1 = ");
				for(int k = 0;k < arr2.length;k++) //循环打印数组
				{
					System.out.printf("%d,",arr1[k]);
				}
				break;
			}
		}
	}
}