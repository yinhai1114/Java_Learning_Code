import java.util.Scanner;
public class HomeWork04{
	public static void main(String[] args){
		int arr[] = {10, 12, 45, 90};//初始数组
		System.out.print("目前数组为");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + "\t");//循环打印数组，告诉用户数组为
			}
		while(true){//输入判断是否接着运行，当执行一次后输入为0结束程序
			//可以考虑使用do whlie
			int arr2[] = new int[arr.length + 1];
			//定义增加的数组，长度为初始数组长度+1
			int enter = 0;//用户输入数字
			int count = 0;//获取输入的数字在第几个数比数组里的数小
			Scanner myScanner = new Scanner(System.in);
			System.out.println("\n请输入一个数字，插入到该数组中");
			enter = myScanner.nextInt();//输入
			for(int i = 0; i < arr.length; i++){
				if(enter < arr[i]){//由于数组是升序排序
					//当数组小于某个数的时候跳出程序 并记录是在第几个小于
					//例如输入一个50，意味着当i = 3时小于90，记录下标
					//在后面的模块将50放到arr[3]中
					count = i;
					System.out.println(count + "下表为");
					break;
				}
				if(count == 0){//记录下标，如果没有获取到下标，意味着这个数是最大的
					//手动记录一个下标为数组长度即i = 4是后面我们要放进去的那个数
					count = arr.length;
				}
			}
			for(int i = 0; i < arr2.length; i++){//循环赋值，将arr数值搬到arr2上
				if(i < count){//例如前面的50我们已经获取到i = 3 的下标是要放入50的
					//当小于这个下标的时候就正常赋值就好
					arr2[i] = arr[i];
				}
				else if(i == count){//当循环到正确的下标之后，将arr2[] 的值改为 enter
					arr2[i] = enter;
				}
				else{//之后只有大于的情况了
					arr2[i] = arr[i - 1];//由于我们已经放过了，所以要少取一个原数组的值
					//对于这样取，即便是最大的情况 也只是不执行else，即放在最屁股后面
					//无论是最大值相同的还是大于最大值的情况都可以包含
				}
			}
			arr = arr2;//引用赋值
			System.out.print("目前数组为");
			for(int i = 0; i < arr.length; i++){//打印数组
				System.out.print(arr[i] + "\t");
			}
			System.out.println("\n输入0结束程序");//询问是否结束程序
			enter = myScanner.nextInt();
			if(enter == 0){
				break;
			}
		}
	}
}
