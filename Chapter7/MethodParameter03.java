public class MethodParameter03{
	public static void main(String[] args){
		Person p = new Person();//��������ʵ����һ������
		B b = new B();
		p.name = "jack";//�������Ը�ֵ
		p.age = 20;
		b.test200(p);
		System.out.println("main�����ڵ�p.age = " + p.age);
	}
}
class Person {
	String name;
	int age = 0;
}
class B{
	public void test200(Person p){//�������Person p��������һ������
		//��ʵ�ʲ�������ʽ�����Ĵ����п��Բ����ٿռ� ǰ����Ҫ��������ռ�
		// p.age = 20000;
		// p = null;
		p = new Person();
		p.name = "tom";
		p.age = 999;
	}
}