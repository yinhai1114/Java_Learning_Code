public class OverLoadExercise01{
	public static void main(String[] args){
		Methods cal = new Methods();
		System.out.println(cal.m(90,2));
		System.out.println(cal.m(20.5,645.7));
		System.out.println(cal.m(6.5,8.9,65.0));
	}
}

class Methods{
	public int m(int n1,int n2){//int int 的和
		int n3 = 0;
		if(n1 > n2){
			n3 = n1;
		}else{
			n3 = n2;
		}
		return n3;
	}
	public double m(double n1,double n2){//int double 的 和
		double n3 = 0;
		if(n1 > n2){
			n3 = n1;
		}else{
			n3 = n2;
		}
		return n3;
	}
	public double m(double n1,double n2,double n3){//double int 的 和
		double max = 0;
		if(n1 > n2){
			max = n1;
		}else {
			max = n2;
		}
		if(n3 > max){
			max = n3;
		}
		return max;
	}
}