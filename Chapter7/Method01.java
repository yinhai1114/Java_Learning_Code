import java.util.Scanner;
public class Method01{
	public static void main(String[] args){
		//����ʹ�� �ȴ������� Ȼ����÷������� 
		Person p1 = new Person();
		p1.speak();//���÷��� ����ִ�е������ȥperson������speak����
		p1.cal01();
		p1.cal02(5);//���÷�����ʱ�� ����ʽ����һ����ֵ ����5������n
		int returnRes = p1.getSum(10,20);//����getSum���ص�ֵ����returnRes
		System.out.println(returnRes);
		System.out.println(p1.getSum(10,20));//ͬ�ϣ������������ֱ�Ӵ�ӡ����

	}
}
class Person{
	String name;
	int age;
	//public ��ʾ�ǹ�����  void��ʾ����û�з���ֵ 
	//speak() ��ʾ������ ()��ʾ�β��б�
	//{}�����壬����д����Ҫִ�еĴ���
	//System.out...��ʾ�������ݣ����һ�仰
	//����д�ú󣬲�ȥ���ò���������
	public void speak(){//һ����������û�з���ֵ
		System.out.println("����һ������");
	}
	public void cal01(){//�����1+...+1000
		int sum = 0;
		for(int i = 1; i <= 1000 ;i++){
			sum += i;
		}
		System.out.println(sum);
	}
	///()��ʾĿǰ��һ���β�n ��ʽ���������Խ����û�����
	public void cal02(int n){
		int sum = 0;
		for(int i = 1; i <= n ;i++){
			sum += i;
		}
		System.out.println(sum);
	}
	//public ��ʾ�����ǹ�����
	//int ��ʾ����ִ�к� ����һ��int�������н���
	//getSum��ʾ������
	//(int num1,int num2)��ʾ���Խ����û��������������
	//return res��ʾ��res��ֵ����
	public int getSum(int num1,int num2){
		int res = num1 + num2;
		return res;
	}
}