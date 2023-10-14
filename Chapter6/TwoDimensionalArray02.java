public class TwoDimensionalArray02{
	public static void main(String[] args){
		int[][] arr = new int [10][];//此时只定义了二位数组的大小，即有三个一维数组
		for(int i = 0; i < arr.length ;i++){//循环3次
			arr[i] = new int[i + 1];//此时arr[i]指的是第i个元素
//int [i + 1]是定义每一个一维数组的大小 比如i = 2的时候，定义第二个数组的大小为3
			for(int j = 0; j < arr[i].length ;j++){//遍历每一个一维数组的每一个元素
				arr[i][j] = i + 1;//赋值
			}
		}
		for(int i = 0; i< arr.length; i++){//遍历二维数组的每一个变量
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}//如果我们要方位第i个以为数组的第j个值 arr[i - 1][j - 1]
			System.out.println();//换行
		}
	}
}