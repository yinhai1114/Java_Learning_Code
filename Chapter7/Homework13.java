public class Homework13{
	public static void main(String[] args){
		Circle c = new Circle();
		Circle b = new Circle();
		PassObject print = new PassObject();
		print.printAreas(c,5);
		System.out.println(c.radius);
		System.out.println(b.radius);
	}
}
class Circle{
	double radius;
	public double findArea(double i){
		radius = i;
		return radius * radius *Math.PI;
	}
}
class PassObject{
	public void printAreas(Circle c,int times){
		System.out.println("Raidus" + "\t" + "Areas");
		for(int i = 1;i <= times ; i++){
			System.out.print(i + "\t" +  c.findArea(i) + "\n");
		}
	}
}