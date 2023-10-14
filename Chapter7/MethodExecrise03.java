public class MethodExercise03{
	public static void main(String[] args){
		Person p = new Person();
		MyTools tools = new MyTools();
		p.name = "jack";
		p.age = 100;
		tools.copyPerson(p);
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
		p2.name = p.name;
		p2.age = p.age;
	}
}