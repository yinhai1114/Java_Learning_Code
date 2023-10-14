import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
		String[] arr = {"a","b","c","b","e","f"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter a letter");
		String target = myScanner.next();
		A02 findWord = new A02();
		System.out.println(findWord.find(arr,target));
	}
}

class A02{
	public int find(String[] n,String n1){
		for(int i = 0;i < n.length;i++){
			if(n[i].equals(n1)){
				return i;
			}
		}
		return -1;
	}
}