import java.util.Scanner;
public class BreakExercise01{
	public static void main(String[] args){
		int k = 1;
		String name = "";
		String passWord = "";
		int time = 3;
		Scanner myScanner = new Scanner(System.in);
		for (;k <= time;k++){
			System.out.println("请输入用户名");
			name = myScanner.next();
			System.out.println("请输入密码");
			passWord = myScanner.next();
			// System.out.println(name + passWord);
			//if(name == "顶针" && passWord == "666"){//需要使用equals，这样单纯==无法比较
			//if(name.equals("顶针") && passWord.equals("666"))//也可以用第二种写法
			if("顶针".equals(name) && "666".equals(passWord)){//推荐用这种写法，可以避免空指针
				System.out.println("允许访问");
				break;
			}
			else if (k < time) {
				System.out.println("密码错误，请重新输入，你还有" + (time - k)+ "次机会");
			}
			else{
				System.out.println("验证错误，已锁定");
			}
		}

	}
}