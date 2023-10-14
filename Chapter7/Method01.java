import java.util.Scanner;
public class Method01{
	public static void main(String[] args){
		//方法使用 先创建对象 然后调用方法即可 
		Person p1 = new Person();
		p1.speak();//调用方法 程序执行到这里会去person类里找speak方法
		p1.cal01();
		p1.cal02(5);//调用方法的时候 给形式参数一个数值 即把5传给了n
		int returnRes = p1.getSum(10,20);//方法getSum返回的值赋给returnRes
		System.out.println(returnRes);
		System.out.println(p1.getSum(10,20));//同上，这个方法可以直接打印出来

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
	///()表示目前有一个形参n 形式参数，可以接受用户输入
	public void cal02(int n){
		int sum = 0;
		for(int i = 1; i <= n ;i++){
			sum += i;
		}
		System.out.println(sum);
	}
	//public 表示方法是公开的
	//int 表示方法执行后 返回一个int可以自行接收
	//getSum表示方法名
	//(int num1,int num2)表示可以接受用户传入的两个参数
	//return res表示把res的值返回
	public int getSum(int num1,int num2){
		int res = num1 + num2;
		return res;
	}
}