public class OverLoad01{
	public static void main(String[] args){
		MyCalculator cal = new MyCalculator();
		System.out.println(cal.calculate(1,6));
		System.out.println(cal.calculate(1,6.9));
		System.out.println(cal.calculate(1.9,6));
		System.out.println(cal.calculate(1,6,10));
	}
}

class MyCalculator{
	public int calculate(int n1,int n2){//int int 的和
		return n1 + n2;
	}
	public double calculate(int n1,double n2){//int double 的 和
		return n1 + n2;
	}
	public double calculate(double n1,int n2){//double int 的 和
		return n1 + n2;
	}
	public int calculate(int n1,int n2,int n3){//三个int的和
		return n1 + n2 + n3;
	}
}