public class Homework01{
	public static void main(String[] args){
		double[] arr = {65.0,64.0,12.0,99.0};
		A01 findNum = new A01();
		System.out.println(findNum.max(arr));
	}
}
class A01{
	public double max(double[] n){
		double max = 0;
		for(int i = 0;i < n.length;i++){
			if(n[i] > max){
				max = n[i];
			}
		}
		return max;
	}
}