import java.util.Scanner;
public class Object01{
	public static void main(String[] args){
		//使用OOP 面向对象来解决
		//实例化一只猫
		Cat cat1 = new Cat();//创建的猫对象赋给cat1
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight = 10.0;

		Cat cat2 = new Cat();//创建第二只猫赋给cat2
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		cat2.weight = 500.0;
		//现在cat1就是一个对象，cat2也是一个对象

		//怎么使用/怎么访问
		System.out.println("第一只猫的信息" + cat1.name + " " + cat1.age
			+ " " + cat1.color + " " + cat1.weight);
		System.out.println("第二只猫的信息" + cat2.name + " " + cat2.age
			+ " " + cat2.color + " " + cat2.weight);
		
	}
}
//定义一个猫类 一个自定义的数据类型
//使用面向对象来解决
class Cat{
	// 属性/特性
	String name;
	int age;
	String color; 
	//这样子增加对象的属性就很方便
	double weight;
	//行为
}

