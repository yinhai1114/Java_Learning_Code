public class Homework14{
	public static void main(String[] args){
		A tom = new A();
		tom.guessingGame(2);
	}
}
class A{
	int times;
	int win;
	int lose;
	String[] list;
	public void printList(){
		for(int i = 0;i < list.length;i++){
			System.out.print(list[i] + "\t");
			if((i + 1) % 3 == 0){
				System.out.println();
			}
		}
	}
	public void historyRecord(String n,String n1,String res){
		String[] arr = new String[times * 3];//长度 等于次数*3
		arr[arr.length - 1] = res;
		arr[arr.length - 2] = n1;
		arr[arr.length - 3] = n;
		if(times > 1){
			for(int i = 0;i < times + 1;i++){
				arr[i] = list[i];
			}
		}
		list = arr;
	}

	public void guessingGame(int n){
		times ++;
		int num =(int)(Math.random() * 3.0);
		String res = "";
		if(n == num){
			res = "平局";
			System.out.println(res);
		}
		if(n > num){
			res = "你赢了";
			System.out.println(res);
			win++;
		}
		if(n < num){
			res = "你输了";
			System.out.println(res);
			lose++;
		}
		String n1 = n + "";
		String num1 = num + "";
		historyRecord(n1,num1,res);
	}
}