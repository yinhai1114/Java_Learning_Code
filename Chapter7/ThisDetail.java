public class ThisDetail{
	public static void main(String[] args){
		T tools = new T();
		// tools.f2();

	}
}
class T{
	public T(){
		this(80);//如果有访问构造器的语法 必须放在第一条语句
		System.out.println("T无参构造器");
	}
	public T(int age){
		System.out.println("T int age构造器");
	}
}