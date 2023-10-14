//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
//.....
//每一行有1个元素，第n行有第n个元素
//每一行的第一个和最后一个都是1
//从第三行开始，对于非第一个元素和最后一个元素的元素的值是
//arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1]
public class YangHui{
	public static void main(String[] args){
		int arr[][] = new int[10][];
		for(int i = 0; i < 10; i++){
			arr[i] = new int[i + 1];//定义第i个一维数组的大小
			for(int j = 0; j < i + 1; j++){
				if(j == 0 || j == i){
					arr[i][j] = 1;//第一个元素和最后一个元素赋值为1
					System.out.printf("%-4d",arr[i][j]);//打印元素
					continue;//写continue是为了避免为第一个或者最后一个元素时
					//执行下面的式子，此时如果是第一个元素j为0，系统会找不到j - 1个元素
					//continue后会跳到最近的for循环接着j++
				}
				if(i > 1){//从第三行开始，中间值就不只是1了，需要用公式计算
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
					System.out.printf("%-4d",arr[i][j]);
				}
			}
			System.out.println();//打印行时换行
		}
	}
}
