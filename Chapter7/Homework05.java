public class Homework05{
	public static void main(String[] args){
		Circle yuan = new Circle(3);
		System.out.println(yuan.perimeter());
		System.out.println(yuan.area());
	}
}
class Circle{
	double radius;

	public Circle(double n){
		 radius = n;
	}
	public double perimeter(){
		return 2 * Math.PI * this.radius;
	}
	public double area(){
		return Math.PI * this.radius * this.radius;
	}

}