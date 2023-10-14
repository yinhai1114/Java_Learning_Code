public class MethodParameter03{
	public static void main(String[] args){
		Person p = new Person();//声明对象，实例化一个对象
		B b = new B();
		p.name = "jack";//对象属性赋值
		p.age = 20;
		b.test200(p);
		System.out.println("main方法内的p.age = " + p.age);
	}
}
class Person {
	String name;
	int age = 0;
}
class B{
	public void test200(Person p){//这里面的Person p是声明了一个对象
		//在实际参数向形式参数的传递中可以不开辟空间 前提是要开过这个空间
		// p.age = 20000;
		// p = null;
		p = new Person();
		p.name = "tom";
		p.age = 999;
	}
}