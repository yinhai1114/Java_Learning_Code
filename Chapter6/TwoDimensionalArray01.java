public class TwoDimensionalArray01{
	public static void main(String[] args){
		int[][] arr = {{0,0, 0, 0, 0,0},
		{0, 0, 1, 0, 0, 0},
		{0, 2, 0, 3, 0, 0},
		{0, 0, 0, 0, 0, 0}};
		for(int i = 0; i< arr.length; i++){//遍历二维数组的每一个变量
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}//如果我们要方位第i个以为数组的第j个值 arr[i - 1][j - 1]
			System.out.println();//换行
		}
		
	}
}