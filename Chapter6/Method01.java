public class Method01{
	public static void main(String[] args){
		//方法使用 先创建对象 然后调用方法即可 
		Person p1 = new Person();
		p1.speak();//调用方法 程序执行到这里会去person类里找speak方法
		p1.col01;
	}
}
class Person{
	String name;
	int age;
	//public 表示是公开的  void表示方法没有返回值 
	//speak() 表示方法名 ()表示形参列表
	//{}方法体，可以写我们要执行的代码
	//System.out...表示方法内容，输出一句话
	//方法写好后，不去调用不会输出语句
	public void speak(){//一个公开方法没有返回值
		System.out.println("我是一个好人");
	}
	public void cal01(){//计算从1+...+1000
		int sum = 0;
		for(int i = 1; i <= 1000 ;i++){
			sum += i;
		}
		System.out.println(sum);
	}
}