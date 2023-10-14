public class VarParameter01{
	public static void main(String[] args){
		HspMethod a = new HspMethod();
		System.out.println(a.sum(654,16,1561,0));
	}
}
class HspMethod{
	//计算两个数的和 三个数的和 四个的和。。N个的和
	//可以使用方法重载 
	// public int sum (int n1,int n2){
	// 	return n1 + n2;
	// }
	// public int sum (int n1,int n2，int n3){
	// 	return n1 + n2;
	// }
	// public int sum (int n1,int n2,int n3,int n4){
	// 	return n1 + n2;
	// }
	//上面几个方法只是形式参数不同，可以使用可变参数优化
	public int sum (int ... nums){//可以接受n个int 这个nums可以当做数组
		System.out.println("接受的参数个数" + nums.length);
		int sums = 0;
		for (int i = 0;i < nums.length;i++){
			sums += nums[i];
		}
		return sums;
	}
}