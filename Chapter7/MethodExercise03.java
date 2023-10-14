public class MethodExercise03{
	public static void main(String[] args){
		Person p = new Person();
		MyTools tools = new MyTools();
		p.name = "jack";
		p.age = 100;
		Person p2 = tools.copyPerson(p); 
		//声明对象Person p2，不需要创建新空间，这里的p2和Mytools的p2不一样
		// p.name = "tom";//验证是否是独立对象
		//也可以使用==判断地址是否相同
		System.out.println(p.name + p.age);
		System.out.println(p2.name + p2.age);
		System.out.println(p == p);//true 是同一个地址所以一样
		System.out.println(p == p2);//false 不是同一个地址所以不一样
	}
}
class Person {
	String name;
	int age = 0;
}

class MyTools{//1.返回类型应该是Person 2.方法的形参应该是Person p 
	//3.方法体，创建一个新对象，并复制属性返回即可
	public Person copyPerson(Person p){
		Person p2 = new Person();
		p2.name = p.name;//属性的复制
		p2.age = p.age;//属性的复制
		return p2;//返回p2
	}
}