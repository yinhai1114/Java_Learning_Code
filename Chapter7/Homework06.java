public class Homework06{
	public static void main(String[] args){
		Cale cal = new Cale(50,70);
		cal.sum();
		cal.sub();
		cal.plus();
		cal.div();
	}
}
class Cale{
	double num;
	double num1;

	public Cale(double num,double num1){
		this.num = num;
		this.num1 = num1;
	}
	public void sum(){
		System.out.println(num + num1);
	}
	public void sub(){
		System.out.println(num - num1);
	}
	public void plus(){
		System.out.println(num * num1);
	}
	public void div(){
		if(num1 == 0){
			System.out.println("除数为0 无法计算");
		}
		else{
			System.out.println(num / num1);
		}
	}
}