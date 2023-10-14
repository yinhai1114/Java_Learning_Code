public class PrintfAndPrintln{
	public static void main(String[] args){
		String name = "Jack";
		int age = 18;
		Double score = 89.50;
		System.out.printf("姓名:%s,年龄:%d,成绩:%.2f\n",name,age,score);
		System.out.println("姓名:"+ name + ",年龄:" + age + ",成绩:" + score);
	}
}