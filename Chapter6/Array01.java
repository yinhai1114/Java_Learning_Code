public class Array01{
	public static void main(String[] args){
		double[] d = {3,5,1,3.4,2,50};//[]表示声明的是double类型的数组， d为数组名
		//{}表示数组内的元素，例如3.4是第3个元素
		System.out.println(d.length);
		double sum = 0.0;
		for(int i = 0;i < d.length;i++){
			System.out.println("第" + i + "个元素的值为" + d[i]);
			sum += d[i];
		}
		System.out.println(sum);
		System.out.println(sum / 6.0);
	}
}