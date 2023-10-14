public class Homework08{
	int count = 9;
	public static void main(String[] args){
		new Homework08().count1();
		Homework08 t1 = new Homework08();
		Homework08 t2 = new Homework08();
		t2.count1();
		System.out.println(t2.count);
		t1.count2();
		t1.count2();
	}
	public void count1(){
		count = 100;
		System.out.println("count1=" + count);
	}
	public void count2(){
		System.out.println("count1= " + count++);
	}
}