public class Object01{
	public static void main(String[] args){
		String[] name = {"小白","小花"};
		int[] age = {3, 100};
		String[] colour = {"白色","花色"};
		String[] enter = new String[1];
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入小猫的名字");
		enter = myScanner.next();
		for(int i = 0; i = name.length; i++){
			if(name[i].equals(enter)){
				System.out.print("\n" + "小猫名字是" + name[i] + "小猫年龄是" 
					+ age[i] + "小猫花色是" + colour[i]);
			}
			else{
				System.out.print("\n" + "张老太没有这只猫");
			}
		}
	}
}

