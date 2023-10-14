public class Homework07{
	public static void main(String[] args){
		Dog d = new Dog("xiaohua","black",19);
		d.show();
		Dog d1 = new Dog("xiaobai","green",1);
		d1.show();
	}
}
class Dog{
	String name;
	String color;
	int age;	
	public void show(){
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
	}
	public Dog(String name,String color,int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
}